SUMMARY = "Module to play and record sound with Python"
DESCRIPTION = "This Python module provides bindings for the PortAudio library and a few \
convenience functions to play and record NumPy arrays containing audio signals."
LICENSE = "MIT"

PV = "0.4.5"

RPM_NAME = "python39-sounddevice-0.4.5-1.3.noarch.rpm"
RPM_HASH = "640ead136d2645044c0023fff7ee827f016ea86c57ea10af4a01ffdb8ff48e5dc66cdf42a922d0aa557038df92338da87d8de4dce4a5d27a1c7f10d9e70902e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(sounddevice) \
python39-sounddevice \
python3dist(sounddevice)"
RDEPENDS:${PN} += "portaudio \
python(abi) \
python39-cffi"

inherit rpm
