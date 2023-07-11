SUMMARY = "Module to play and record sound with Python"
DESCRIPTION = "This Python module provides bindings for the PortAudio library and a few \
convenience functions to play and record NumPy arrays containing audio signals."
LICENSE = "MIT"

PV = "0.4.5"

RPM_NAME = "python39-sounddevice-0.4.5-1.5.noarch.rpm"
RPM_HASH = "6e48868974e21d450d6212574a5caec7d6e9f97f54dd9a4d81e36edfd1ccb2235f6c9f9841080779a316c9fc8669329df40aefc1ac0245dcca852231cde57c39"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-sounddevice \
python39-sounddevice \
python3dist-sounddevice"

RDEPENDS:${PN} += "portaudio \
python-abi \
python39-cffi"

inherit rpm
