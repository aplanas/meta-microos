SUMMARY = "Asynchronous audio playback for Python"
DESCRIPTION = "The simplaudio package provides audio playback capability for Python 3 \
on OSX, Windows, and Linux."
LICENSE = "MIT"

PV = "1.0.4"

RPM_NAME = "python39-simpleaudio-1.0.4-1.21.aarch64.rpm"
RPM_HASH = "eb3a24d76201d9db8cc9a3aeb842bb1458b39d23de7eb52c45d72b9e3de4fabcdbb643d3a2257683d154b29191a3befc132d2631fb876a012e80d55f1b20b5fd"

RPROVIDES:${PN} += "python3.9dist-simpleaudio \
python39-simpleaudio \
python3dist-simpleaudio"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
python-abi"

inherit rpm
