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

RPM_NAME = "linuxconsoletools-1.8.1-1.3.aarch64.rpm"
RPM_HASH = "c17b23c407395c4c263105ca942b8142bcd40d379f9acdf28f2de66894d5dbddcfc97a92d4d1ce1a1cec2b182ff4da9f9457838002ba6454bd48fd34ee1efef8"

RPROVIDES:${PN} += "input-utils \
linuxconsoletools"

RDEPENDS:${PN} += "/usr/bin/awk \
/usr/bin/bash \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libc.so.6 \
libm.so.6"

inherit rpm
