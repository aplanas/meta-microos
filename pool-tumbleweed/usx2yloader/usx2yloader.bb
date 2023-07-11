SUMMARY = "Second phase firmware loader for Tascam USX2Y USB soundcards"
DESCRIPTION = "Usx2yloader is a helper program to load the 2nd Phase firmware binaries \
onto the Tascam USX2Y USB soundcards."
LICENSE = "GPL-2.0-or-later"

PV = "0.3"

RPM_NAME = "usx2yloader-0.3-24.4.aarch64.rpm"
RPM_HASH = "16d840ff7e2f0eb09d19d49ff8d8361ee5047bc8885de471040086e53dc67178ef1605e11aa75ae3b5e2f5db7eeb4488c09235a6761f38f4010d44c71d1632cf"

RPROVIDES:${PN} += "alsa-tools-/usr/bin/usx2yloader \
usx2yloader"

RDEPENDS:${PN} += "alsa-firmware \
fxload \
ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6"

inherit rpm
