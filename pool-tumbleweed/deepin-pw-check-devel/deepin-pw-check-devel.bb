SUMMARY = "Development tools for deepin-pw-check"
DESCRIPTION = "The deepin-pw-check-devel package contains the header files and developer \
docs for deepin-pw-check."
LICENSE = "GPL-3.0+"

PV = "5.1.16"

RPM_NAME = "deepin-pw-check-devel-5.1.16-1.6.aarch64.rpm"
RPM_HASH = "b3452466e504c6cc90642d3c04fd40eee2050e63ee6a15c68e19b2622af95ffc148613fb6ed54ec4c118b2e2605945dab17c7ea13d23e2cab304d49117ee4bae"

RPROVIDES:${PN} += "deepin-pw-check-devel \
libdeepin-pw-check.so.1 \
pkgconfig-libdeepin-pw-check"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrack.so.2 \
libcrypt.so.1 \
libdeepin-pw-check1 \
libiniparser.so.1"

inherit rpm
