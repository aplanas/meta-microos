SUMMARY = "Python wrapper for PortAudio's ring buffer"
DESCRIPTION = "The ring buffer functionality is typically not included in binary \
distributions of PortAudio, therefore most Python wrappers don't include it, \
either. \
 \
The pa_ringbuffer module provides only a Python wrapper, the actual \
PortAudio ring buffer code has to be compiled separately. \
It can be used on any Python version where CFFI is available. \
 \
This module is designed to be used together with the sounddevice module (it \
might work with other modules, too) for non-blocking transfer of data between \
the main Python program and an audio callback function which is implemented in C \
or some other compiled language. \
 \
This module is not meant to be used on its own, it is only useful in cooperation \
with another Python module using CFFI."
LICENSE = "MIT"

PV = "0.1.4"

RPM_NAME = "python310-pa-ringbuffer-0.1.4-1.4.noarch.rpm"
RPM_HASH = "4c055a053ed3557da3254d1f6ce47e25736f5e38f159f26d77c4e264713c3401304c564705d5b7cb212b9ab52a97cc8c3383bceef5ef83b6b588aa8285cf7daf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pa-ringbuffer \
python310-pa-ringbuffer \
python3dist-pa-ringbuffer"

RDEPENDS:${PN} += "python-abi \
python310-cffi"

inherit rpm
