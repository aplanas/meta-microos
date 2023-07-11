SUMMARY = "Development files for the Input Device Library"
DESCRIPTION = "libinput is a library that handles input devices for display servers and \
other applications that need to directly deal with input devices. \
 \
This package contains all necessary include files and libraries needed \
to develop applications that require libinput."
LICENSE = "MIT"

PV = "1.23.0"

RPM_NAME = "libinput-devel-1.23.0-1.2.aarch64.rpm"
RPM_HASH = "fa26c2540f41e66eb9f2ff8d329a6db28819bfb0f977f2915cd0c70dbb6d13d6b2e1a52a94babbae8e828e6965e4f09ef9dad49da3f4822b7570cfc2c40aa7c9"

RPROVIDES:${PN} += "libinput-devel \
pkgconfig-libinput"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libinput10"

inherit rpm
