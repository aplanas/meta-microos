SUMMARY = "Module to play and record sound with Python"
DESCRIPTION = "This Python module provides bindings for the PortAudio library and a few \
convenience functions to play and record NumPy arrays containing audio signals."
LICENSE = "MIT"

PV = "0.4.5"

RPM_NAME = "python310-sounddevice-0.4.5-1.5.noarch.rpm"
RPM_HASH = "5fa4d488f1fd11bbec23b36dabe7510598a59399225155eb641120f4aaaf870fc3ffb764b359bb48206266caae53dcb77276c3bbcebc7750eda51a13cbc8fe7a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-sounddevice \
python310-sounddevice \
python3dist-sounddevice"

RDEPENDS:${PN} += "portaudio \
python-abi \
python310-cffi"

inherit rpm
