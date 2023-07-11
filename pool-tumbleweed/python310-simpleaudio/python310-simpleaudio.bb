SUMMARY = "Asynchronous audio playback for Python"
DESCRIPTION = "The simplaudio package provides audio playback capability for Python 3 \
on OSX, Windows, and Linux."
LICENSE = "MIT"

PV = "1.0.4"

RPM_NAME = "python310-simpleaudio-1.0.4-1.21.aarch64.rpm"
RPM_HASH = "2e1819d24df64614a9f27b96fa9782946559f7eb1926e233389b0ddcdebcf9beb7b3cccf73c3cb6577e55bb73fb060da322283bd30438ec1b3cf087725846543"

RPROVIDES:${PN} += "python3.10dist-simpleaudio \
python310-simpleaudio \
python3dist-simpleaudio"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
python-abi"

inherit rpm
