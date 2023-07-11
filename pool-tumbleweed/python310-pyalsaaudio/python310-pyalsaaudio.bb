SUMMARY = "ALSA bindings for Python"
DESCRIPTION = "This package contains wrappers for accessing the ALSA API from Python. \
It is fairly complete for PCM devices and Mixer access."
LICENSE = "Python-2.0"

PV = "0.10.0"

RPM_NAME = "python310-pyalsaaudio-0.10.0-1.3.aarch64.rpm"
RPM_HASH = "c67c73ca2492d204ee90c57062993e78398ebfaca20a8d255e41c319640eeed47a420109efff37140adbeff82087ca7e59272795dc41c5a314763bd1304b0965"

RPROVIDES:${PN} += "python3.10dist-pyalsaaudio \
python310-pyalsaaudio \
python3dist-pyalsaaudio"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
python-abi"

inherit rpm
