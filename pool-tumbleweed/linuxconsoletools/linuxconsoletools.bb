SUMMARY = "A set of utilities for joysticks"
DESCRIPTION = "This package contains the following utilities and associated \
documentation: \
* joystick utilities - calibrate and test joysticks and joypads \
 \
The following utilities are provided to calibrate and test joysticks: \
* evdev-joystick - test & calibrate joysticks using evdev devices \
* ffcfstress, ffmvforce, fftest - test force-feedback devices \
* ffset - set force-feedback device parameters \
* jscal - calibrate joystick devices, reconfigure the axes and buttons \
* jscal-store, jscal-restore - store and retrieve joystick device settings as configured using jscal \
* jstest - test joystick devices"
LICENSE = "GPL-2.0-or-later"

PV = "1.8.1"

RPM_NAME = "linuxconsoletools-1.8.1-1.2.aarch64.rpm"
RPM_HASH = "d699a14b702b0a1f27206d91df2815831f5c57199324df69db66132aca7833b74f59de0337ea3d59ae52668fd553a622532d5d2f2a07f45aed7c70e34b77cb8c"

RPROVIDES:${PN} += "input-utils \
linuxconsoletools \
linuxconsoletools(aarch-64)"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/awk \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libSDL2-2.0.so.0()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit)"

inherit rpm
