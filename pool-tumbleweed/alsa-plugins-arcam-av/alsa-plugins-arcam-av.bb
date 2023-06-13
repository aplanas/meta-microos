SUMMARY = "Arcam AV Amplifier Plug-In for ALSA Library"
DESCRIPTION = "This package contains a control plugin to access Arcam AV amplifier device \
for ALSA library."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.7.1"

RPM_NAME = "alsa-plugins-arcam-av-1.2.7.1-4.5.aarch64.rpm"
RPM_HASH = "e7506fab7a8e1fe00899fbcabfdea9ce33b11cf5a4df31aee5ac9f421d6aa865a2a62f7bfc36cee4ce5cdf1b1602c492f10200b175b81b668f42412dc3e1b1d3"

RPROVIDES:${PN} += "alsa-plugins-arcam-av \
alsa-plugins-arcam-av(aarch-64) \
libasound_module_ctl_arcam_av.so()(64bit)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libasound.so.2()(64bit) \
libasound.so.2(ALSA_0.9)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
