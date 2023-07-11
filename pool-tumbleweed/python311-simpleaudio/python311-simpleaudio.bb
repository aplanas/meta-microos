SUMMARY = "Asynchronous audio playback for Python"
DESCRIPTION = "The simplaudio package provides audio playback capability for Python 3 \
on OSX, Windows, and Linux."
LICENSE = "MIT"

PV = "1.0.4"

RPM_NAME = "python311-simpleaudio-1.0.4-1.21.aarch64.rpm"
RPM_HASH = "5a3b1cb1acbab6645dbec6c4ea17f7e714697f2302b7ec32c32926ae8b065cd52da21ff54197b083f41b2cf8727249a61f9ee958226d026765615d86450505ae"

RPROVIDES:${PN} += "python3-simpleaudio \
python3.11dist-simpleaudio \
python311-simpleaudio \
python3dist-simpleaudio"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
python-abi"

inherit rpm
