SUMMARY = "Development Files for Keybinder"
DESCRIPTION = "This package contains development files needed for developing applications \
based on keybinder."
LICENSE = "GPL-2.0-or-later & MIT"

PV = "0.3.1"

RPM_NAME = "keybinder-devel-0.3.1-3.6.aarch64.rpm"
RPM_HASH = "644e89e74dddf51a8b304f744f50510c0c7a4d90b94cb6aa8ea4586d7a898bde81157e10232db6666a616ec7a974ab43f0ff3b87975572f88dffa51cb80be0af"

RPROVIDES:${PN} += "keybinder-devel \
keybinder-devel(aarch-64) \
pkgconfig(keybinder)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libkeybinder0 \
pkgconfig(gtk+-2.0)"

inherit rpm
