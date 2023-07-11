SUMMARY = "Linux Kernel Crypto API User Space Interface Library"
DESCRIPTION = "libkcapi exports APIs so that developers need not consider the low-level \
Netlink interface handling that is used for accesing the Linux kernel crypto \
API. \
 \
The library does not implement any cipher algorithms. All consumer requests are \
sent to the kernel for processing. Results from the kernel crypto API are \
returned to the consumer via the library API. \
 \
The kernel interface and therefore this library can be used by unprivileged \
processes. \
 \
This library does not perform any memcpy for processing the cryptographic data! \
The library uses scatter / gather lists to eliminate the need for moving data \
around in memory."
LICENSE = "GPL-2.0-only"

PV = "1.4.0"

RPM_NAME = "libkcapi-devel-1.4.0-2.5.aarch64.rpm"
RPM_HASH = "45bc1cc82b26a7ffbd1632cc1db2af70c34dba4e5816b8b36f8dd1beb69f99e927122600a0cc32fc1ddfd581c45d3a87a3b461621c79c596df97d1268b6276d7"

RPROVIDES:${PN} += "libkcapi-devel \
pkgconfig-libkcapi"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libkcapi1"

inherit rpm
