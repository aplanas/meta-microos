SUMMARY = "PulseAudio emulation for ALSA"
DESCRIPTION = "PulseAudio emulation intended to be used with Firefox and Skype."
LICENSE = "MIT"

PV = "0.1.13"

RPM_NAME = "apulse-0.1.13-2.12.aarch64.rpm"
RPM_HASH = "aa981b5b7a711569624c648a56c2f4e0220ca15af07804038c0c5549b4c471d118fa1c338522a8814fcb8c7db1118853d6155d8b33bdca77155daa13cbc33dbe"

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
