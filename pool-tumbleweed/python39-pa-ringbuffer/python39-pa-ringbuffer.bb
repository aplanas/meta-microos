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

RPM_NAME = "python39-pa-ringbuffer-0.1.4-1.4.noarch.rpm"
RPM_HASH = "57cae3e283e4db18a6a5d8544430690f0c2cb663fc5503c05b6d3b2bdb878649dd9e454f6ca2589a838f346fb11b01636e19998dbf1f23536e775fd3f4bebd75"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pa-ringbuffer \
python39-pa-ringbuffer \
python3dist-pa-ringbuffer"

RDEPENDS:${PN} += "python-abi \
python39-cffi"

inherit rpm
