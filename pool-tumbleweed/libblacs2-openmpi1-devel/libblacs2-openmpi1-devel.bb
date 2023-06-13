SUMMARY = "Development libraries for BLACS (openmpi1)"
DESCRIPTION = "This package contains development libraries for BLACS, compiled against openmpi1."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "libblacs2-openmpi1-devel-2.1.0-9.11.aarch64.rpm"
RPM_HASH = "5fb7b25eaf50a1a11d9b5e6d9a554ae12f210b26dec225738711c56ff6706153d1691f8a44c1c213ce2fdd1b973735adc1461ddf9ef7fd3029bcc85099aa46c2"

RPROVIDES:${PN} += "blacs-openmpi1-devel \
libblacs.so.2.1.0()(64bit) \
libblacs2-openmpi1-devel \
libblacs2-openmpi1-devel(aarch-64)"

RDEPENDS:${PN} += "blacs-devel-headers \
ld-linux-aarch64.so.1()(64bit) \
libblacs2-openmpi1 \
libc.so.6()(64bit) \
libmpi.so.12()(64bit) \
openmpi1-devel"

inherit rpm
