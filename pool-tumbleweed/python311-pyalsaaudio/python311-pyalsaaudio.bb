SUMMARY = "ALSA bindings for Python"
DESCRIPTION = "This package contains wrappers for accessing the ALSA API from Python. \
It is fairly complete for PCM devices and Mixer access."
LICENSE = "Python-2.0"

PV = "0.10.0"

RPM_NAME = "python311-pyalsaaudio-0.10.0-1.1.aarch64.rpm"
RPM_HASH = "e83bf9d6e5884361b3770ec38e5b1673d5c876c9d20fee4078096ac7afffb2473d93eef4d13ec1ab17e582859b113a35d27edc17ab9e0db8f2bb0e2c4e97e3fc"

RPROVIDES:${PN} += "python3.11dist(pyalsaaudio) \
python311-pyalsaaudio \
python311-pyalsaaudio(aarch-64) \
python3dist(pyalsaaudio)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libasound.so.2()(64bit) \
libasound.so.2(ALSA_0.9)(64bit) \
libasound.so.2(ALSA_0.9.0rc4)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi)"

inherit rpm
