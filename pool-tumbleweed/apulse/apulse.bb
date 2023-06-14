SUMMARY = "PulseAudio emulation for ALSA"
DESCRIPTION = "PulseAudio emulation intended to be used with Firefox and Skype."
LICENSE = "MIT"

PV = "0.1.13"

RPM_NAME = "apulse-0.1.13-2.11.aarch64.rpm"
RPM_HASH = "342b32f53d3d494dc71796974f8a98b1c4f17a551d97ba94b8a9a0a1a51842c29ee86ec81e6a609ec73a8c4616ad48cf10f1168d890784b45cb3aff1b86fa71a"

RPROVIDES:${PN} += "apulse \
config-apulse"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libglib-2.0.so.0 \
libm.so.6 \
libpulse.so.0"

inherit rpm
