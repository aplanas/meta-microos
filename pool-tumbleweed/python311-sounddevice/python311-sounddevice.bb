SUMMARY = "Module to play and record sound with Python"
DESCRIPTION = "This Python module provides bindings for the PortAudio library and a few \
convenience functions to play and record NumPy arrays containing audio signals."
LICENSE = "MIT"

PV = "0.4.5"

RPM_NAME = "python311-sounddevice-0.4.5-1.3.noarch.rpm"
RPM_HASH = "6292fe533eb4d501940adccb9181ba4dfe38b4289bdcc3700d9cc3bb539ffc30c25116789f24c03a6e8dfac08586df209b69372195070385cdd123b482d03cbd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-sounddevice \
python311-sounddevice \
python3dist-sounddevice"

RDEPENDS:${PN} += "portaudio \
python-abi \
python311-cffi"

inherit rpm
