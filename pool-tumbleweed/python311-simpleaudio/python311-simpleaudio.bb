SUMMARY = "Asynchronous audio playback for Python"
DESCRIPTION = "The simplaudio package provides audio playback capability for Python 3 \
on OSX, Windows, and Linux."
LICENSE = "MIT"

PV = "1.0.4"

RPM_NAME = "python311-simpleaudio-1.0.4-1.19.aarch64.rpm"
RPM_HASH = "fb21923d969d2246e19b5750a15ad647a922bb8e5edbd2be9aed223ecadf86f8d1ae5bf7597b0944cbcbe5706523dca77c604d32fdba43d670e8cbae08c45763"

RPROVIDES:${PN} += "python3.11dist(simpleaudio) \
python311-simpleaudio \
python311-simpleaudio(aarch-64) \
python3dist(simpleaudio)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libasound.so.2()(64bit) \
libasound.so.2(ALSA_0.9)(64bit) \
libasound.so.2(ALSA_0.9.0rc4)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
python(abi)"

inherit rpm
