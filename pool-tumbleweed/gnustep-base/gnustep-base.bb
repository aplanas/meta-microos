SUMMARY = "GNUstep Base library package"
DESCRIPTION = "The GNUstep Base Library is a library of general-purpose, \
non-graphical Objective C classes, inspired by the \
OpenStep API but implementing Apple and GNU additions to the API \
as well."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "1.29.0"

RPM_NAME = "gnustep-base-1.29.0-1.5.aarch64.rpm"
RPM_HASH = "50dd4e8a0b9a209722426d0f882c93601da406a88ed84fc2234a26c827f3a353636c74e3c2fe8f361e4a2c2c93ac9fb55ade8eed4ee7a546eeaa875587d37fac"

RPROVIDES:${PN} += "config-gnustep-base \
gnustep-base"

RDEPENDS:${PN} += "/usr/bin/sh \
gnustep-make \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgnustep-base.so.1.29 \
libobjc.so.4"

inherit rpm
