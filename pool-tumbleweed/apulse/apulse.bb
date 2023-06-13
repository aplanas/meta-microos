SUMMARY = "PulseAudio emulation for ALSA"
DESCRIPTION = "PulseAudio emulation intended to be used with Firefox and Skype."
LICENSE = "MIT"

PV = "0.1.13"

RPM_NAME = "apulse-0.1.13-2.11.aarch64.rpm"
RPM_HASH = "342b32f53d3d494dc71796974f8a98b1c4f17a551d97ba94b8a9a0a1a51842c29ee86ec81e6a609ec73a8c4616ad48cf10f1168d890784b45cb3aff1b86fa71a"

RPROVIDES:${PN} += "apulse \
apulse(aarch-64) \
config(apulse)"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/python3 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libasound.so.2()(64bit) \
libasound.so.2(ALSA_0.9)(64bit) \
libasound.so.2(ALSA_0.9.0rc4)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libglib-2.0.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libpulse.so.0()(64bit) \
libpulse.so.0(PULSE_0)(64bit)"

inherit rpm
