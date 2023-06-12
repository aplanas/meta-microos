SUMMARY = "Development files for lxqt-globalkeys"
DESCRIPTION = "Development files for lxqt-globalkeys including headers and libraries"
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.0"

RPM_NAME = "lxqt-globalkeys-devel-1.3.0-1.1.aarch64.rpm"
RPM_HASH = "440d85d198c914c6385a63570d8d83f659c96456239cb8f3178d2c21757447ade08823fd0b16ea325b7dec172686437c3778a6e2490c5175904419557f096962"

RPROVIDES:${PN} += "cmake(lxqt-globalkeys) \
cmake(lxqt-globalkeys-ui) \
lxqt-globalkeys-devel \
lxqt-globalkeys-devel(aarch-64) \
pkgconfig(lxqt-globalkeys) \
pkgconfig(lxqt-globalkeys-ui)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
liblxqt-globalkeys-ui1 \
liblxqt-globalkeys1 \
lxqt-globalkeys \
pkgconfig \
pkgconfig(Qt5DBus) \
pkgconfig(Qt5Widgets) \
pkgconfig(lxqt-globalkeys)"

inherit rpm
