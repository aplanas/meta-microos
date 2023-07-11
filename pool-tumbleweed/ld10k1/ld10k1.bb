SUMMARY = "Emu10k1 patch loader for ALSA"
DESCRIPTION = "This package contains the patch loader program for Emu10k1 and Emu10k1 on ALSA."
LICENSE = "GPL-2.0-or-later"

PV = "0.1.8p1"

RPM_NAME = "ld10k1-0.1.8p1-24.4.aarch64.rpm"
RPM_HASH = "ebd7618b8dc639dcf7371d8e328000875f0e28207508112ee6822ea7ad04154fde1d6469943423d8270a7baa723df0cd52e8ef5af58b8e13d59e796ab4dafaaa"

RPROVIDES:${PN} += "alsa-tools-/usr/bin/lo10k1 \
ld10k1"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
liblo10k1.so.0"

inherit rpm
