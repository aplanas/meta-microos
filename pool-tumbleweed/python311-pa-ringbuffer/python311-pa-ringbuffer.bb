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

RPM_NAME = "python311-pa-ringbuffer-0.1.4-1.4.noarch.rpm"
RPM_HASH = "0df873ff1ab9118b4949e4124d875c97becdfaa0d2693907e67b8ccb20052affae30e5fe5ae88a58596db4ac252301dc49d4b64067dbcd3cb2e69e958b75058d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pa-ringbuffer \
python3.11dist-pa-ringbuffer \
python311-pa-ringbuffer \
python3dist-pa-ringbuffer"

RDEPENDS:${PN} += "python-abi \
python311-cffi"

inherit rpm
