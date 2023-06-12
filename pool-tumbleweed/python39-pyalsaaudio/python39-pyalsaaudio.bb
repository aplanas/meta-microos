SUMMARY = "ALSA bindings for Python"
DESCRIPTION = "This package contains wrappers for accessing the ALSA API from Python. \
It is fairly complete for PCM devices and Mixer access."
LICENSE = "Python-2.0"

PV = "0.10.0"

RPM_NAME = "python39-pyalsaaudio-0.10.0-1.1.aarch64.rpm"
RPM_HASH = "175232716dc5cf2fa22e1a9d8a19c533d11887677d9697cd205c80c4f4ca9a0ecb18a07b5e373354441caa0d2971cb6e6eeffe2c8144b2e06dc98a7a762dc4e2"

RPROVIDES:${PN} += "python3.9dist(pyalsaaudio) \
python39-pyalsaaudio \
python39-pyalsaaudio(aarch-64) \
python3dist(pyalsaaudio)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libasound.so.2()(64bit) \
libasound.so.2(ALSA_0.9)(64bit) \
libasound.so.2(ALSA_0.9.0rc4)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi)"

inherit rpm