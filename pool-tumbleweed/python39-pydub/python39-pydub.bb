SUMMARY = "Audio manipulation with Python"
DESCRIPTION = "A Python module to manipulate audio with a high level interface."
LICENSE = "MIT"

PV = "0.25.1"

RPM_NAME = "python39-pydub-0.25.1-2.4.noarch.rpm"
RPM_HASH = "f8ea3136306d9ccd0ba02087c18b301b7a8ff0cd10106d7c45342f22ffdaed586e4f875f88e6ab404df0cbd340d8fbfca73e97fa00e7e2d2a0f6e25e16b343ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pydub \
python39-pydub \
python3dist-pydub"

RDEPENDS:${PN} += "ffmpeg \
python-abi"

inherit rpm
