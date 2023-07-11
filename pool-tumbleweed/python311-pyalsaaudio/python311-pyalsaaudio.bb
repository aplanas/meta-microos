SUMMARY = "ALSA bindings for Python"
DESCRIPTION = "This package contains wrappers for accessing the ALSA API from Python. \
It is fairly complete for PCM devices and Mixer access."
LICENSE = "Python-2.0"

PV = "0.10.0"

RPM_NAME = "python311-pyalsaaudio-0.10.0-1.3.aarch64.rpm"
RPM_HASH = "5d0d6cc79d7928f80251046feb421cc60c776b4247c2443a2fba85aff631a5b4481e288854ce438e46fe83d7879c2bbbacc36916d6c0b5fd6e0a6851d0f50506"

RPROVIDES:${PN} += "python3-pyalsaaudio \
python3.11dist-pyalsaaudio \
python311-pyalsaaudio \
python3dist-pyalsaaudio"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
python-abi"

inherit rpm
