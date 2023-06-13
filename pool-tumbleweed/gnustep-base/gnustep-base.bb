SUMMARY = "GNUstep Base library package"
DESCRIPTION = "The GNUstep Base Library is a library of general-purpose, \
non-graphical Objective C classes, inspired by the \
OpenStep API but implementing Apple and GNU additions to the API \
as well."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "1.29.0"

RPM_NAME = "gnustep-base-1.29.0-1.5.aarch64.rpm"
RPM_HASH = "50dd4e8a0b9a209722426d0f882c93601da406a88ed84fc2234a26c827f3a353636c74e3c2fe8f361e4a2c2c93ac9fb55ade8eed4ee7a546eeaa875587d37fac"

RPROVIDES:${PN} += "config(gnustep-base) \
gnustep-base \
gnustep-base(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
gnustep-make \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgnustep-base.so.1.29()(64bit) \
libobjc.so.4()(64bit)"

inherit rpm
