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

RPM_NAME = "python39-pa-ringbuffer-0.1.4-1.3.noarch.rpm"
RPM_HASH = "5f3a943ca978237c2561b6ee0588847c9594678fc19ff86081fee57e06d3debf624acf775c3577ac01a59097a6e3c2c6337336c8e72c26376baef8ea9b9d1872"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pa-ringbuffer \
python39-pa-ringbuffer \
python3dist-pa-ringbuffer"

RDEPENDS:${PN} += "python-abi \
python39-cffi"

inherit rpm
