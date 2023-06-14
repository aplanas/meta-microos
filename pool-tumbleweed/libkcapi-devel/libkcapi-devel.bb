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

RPM_NAME = "libkcapi-devel-1.4.0-2.3.aarch64.rpm"
RPM_HASH = "ebc97ae76a706f9ae3490d99e1a11202d908a8eae1434ee43fa91b6b5d0ee357a75de3777a264cf0f0b7e0cf7472276a1df4eae9c66b53bca4a14c4f57f251e0"

RPROVIDES:${PN} += "libkcapi-devel \
pkgconfig-libkcapi"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libkcapi1"

inherit rpm
