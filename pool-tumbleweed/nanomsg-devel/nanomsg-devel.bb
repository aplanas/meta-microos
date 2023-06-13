SUMMARY = "Header files for nanomsg"
DESCRIPTION = "Development and header files for nanomsg."
LICENSE = "MIT"

PV = "1.2"

RPM_NAME = "nanomsg-devel-1.2-1.3.aarch64.rpm"
RPM_HASH = "57f93fce47c52a2e61fc5e9675b7a43b037436386f7416a3da2e87e82138bf719406b95d1745d7406cc11174742faf6144d7bd44e8bd67eba0ef134e42fb9308"

RPROVIDES:${PN} += "cmake(nanomsg) \
nanomsg-devel \
nanomsg-devel(aarch-64) \
pkgconfig(nanomsg)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libnanomsg.so.6()(64bit) \
libnanomsg6"

inherit rpm
