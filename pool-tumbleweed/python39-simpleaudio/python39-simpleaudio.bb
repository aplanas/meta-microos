SUMMARY = "Asynchronous audio playback for Python"
DESCRIPTION = "The simplaudio package provides audio playback capability for Python 3 \
on OSX, Windows, and Linux."
LICENSE = "MIT"

PV = "1.0.4"

RPM_NAME = "python39-simpleaudio-1.0.4-1.19.aarch64.rpm"
RPM_HASH = "781f84136177e664c32451bb3c0b5e2858dec7d971cdf06615787477dfe81996257a60c3296825cf0e7a820aaf21d4b7e2d92586aaf60e71af960a23d67fdde0"

RPROVIDES:${PN} += "python3.9dist(simpleaudio) \
python39-simpleaudio \
python39-simpleaudio(aarch-64) \
python3dist(simpleaudio)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libasound.so.2()(64bit) \
libc.so.6()(64bit) \
python(abi)"

inherit rpm
