SUMMARY = "Firmware loader for RME Hammerfall DSP cards"
DESCRIPTION = "This is the firmware loader program for RME Hammerfall DSP cards."
LICENSE = "GPL-2.0-or-later"

PV = "1.2"

RPM_NAME = "hdsploader-1.2-24.3.aarch64.rpm"
RPM_HASH = "6e108a9849dd795ed5c76a8be316cb8983b673539394399609e5af49bb9de059f98bac1dc8181fe7118e0213b35e7ea22d2f830f2936e690cfe92fd221736ef5"

RPROVIDES:${PN} += "alsa-tools:/usr/bin/hdsploader \
hdsploader \
hdsploader(aarch-64)"

RDEPENDS:${PN} += "alsa-firmware \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libasound.so.2()(64bit) \
libasound.so.2(ALSA_0.9)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
