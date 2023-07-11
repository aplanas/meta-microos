SUMMARY = "Module to play and record sound with Python"
DESCRIPTION = "This Python module provides bindings for the PortAudio library and a few \
convenience functions to play and record NumPy arrays containing audio signals."
LICENSE = "MIT"

PV = "0.4.5"

RPM_NAME = "python311-sounddevice-0.4.5-1.5.noarch.rpm"
RPM_HASH = "c9d4280604cd3fb8266a257d01ed31c8bf1cc9eb0837ee5c2dab1d38229dc5c82deab68ac24a8168840ce842b81e25aa9ac2a8f8e013a8559e4f8cbdb0359f0a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sounddevice \
python3.11dist-sounddevice \
python311-sounddevice \
python3dist-sounddevice"

RDEPENDS:${PN} += "portaudio \
python-abi \
python311-cffi"

inherit rpm
