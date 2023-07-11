SUMMARY = "ALSA bindings for Python"
DESCRIPTION = "This package contains wrappers for accessing the ALSA API from Python. \
It is fairly complete for PCM devices and Mixer access."
LICENSE = "Python-2.0"

PV = "0.10.0"

RPM_NAME = "python39-pyalsaaudio-0.10.0-1.3.aarch64.rpm"
RPM_HASH = "9d5f6025e0565832b6fe0a9fe8df7b097214cec3bec594c315f2b5ebc1bc0f14776b94d4d4fbaaffbeba6ec703e3b8e28690a6c258144fa9f4cf3280880f0173"

RPROVIDES:${PN} += "python3.9dist-pyalsaaudio \
python39-pyalsaaudio \
python3dist-pyalsaaudio"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
python-abi"

inherit rpm
