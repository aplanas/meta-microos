SUMMARY = "Pulseaudio plugin for xine"
DESCRIPTION = "libxine sound output plugin for the pulseaudio soundserver \
 \
 \
 \
Authors: \
-------- \
    Guenter Bartsch <guenter@users.sourceforge.net>"
LICENSE = "GPL-2.0-or-later & SUSE-Public-Domain"

PV = "1.2.13"

RPM_NAME = "libxine2-pulse-1.2.13-2.2.aarch64.rpm"
RPM_HASH = "f6a38942272b9fe55bf5305459cf6ff3d0c90c8c076f9b3c566f1c7669920cab0215ffe61eb2f8fd2a84dafd61bbd52f9b1764b8ae9fb087f13166cc0fb04c59"

RPROVIDES:${PN} += "libxine2-pulse \
libxine2-pulse(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libpulse.so.0()(64bit) \
libpulse.so.0(PULSE_0)(64bit) \
libxine.so.2()(64bit) \
libxine2"

inherit rpm
