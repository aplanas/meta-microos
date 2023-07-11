SUMMARY = "Header files for nanomsg"
DESCRIPTION = "Development and header files for nanomsg."
LICENSE = "MIT"

PV = "1.2"

RPM_NAME = "nanomsg-devel-1.2-1.4.aarch64.rpm"
RPM_HASH = "247679e6bd5b5c72da5141b6fadb79a48fb7aee4a68b0b93bfe3abbcf710d7b3c2de81167ac1d4c7412d921ccda130b8b0d4774c8466130f244628a753c9d8f1"

RPROVIDES:${PN} += "cmake-nanomsg \
nanomsg-devel \
pkgconfig-nanomsg"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6 \
libnanomsg.so.6 \
libnanomsg6"

inherit rpm
