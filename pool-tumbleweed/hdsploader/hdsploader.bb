SUMMARY = "Firmware loader for RME Hammerfall DSP cards"
DESCRIPTION = "This is the firmware loader program for RME Hammerfall DSP cards."
LICENSE = "GPL-2.0-or-later"

PV = "1.2"

RPM_NAME = "hdsploader-1.2-24.4.aarch64.rpm"
RPM_HASH = "698a3daf270160425dd41b3417b6d01964e1c7dedf897e0eae5b7cb1d0f401fa893eea492d60fc5771386bb13e5f6a4e55ec6ab1898820a07548238f94fe8bae"

RPROVIDES:${PN} += "alsa-tools-/usr/bin/hdsploader \
hdsploader"

RDEPENDS:${PN} += "alsa-firmware \
ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6"

inherit rpm
