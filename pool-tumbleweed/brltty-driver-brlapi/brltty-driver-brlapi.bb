SUMMARY = "BrlAPI driver for BRLTTY"
DESCRIPTION = "BRLTTY is a background process (daemon) which provides access to the \
Linux/Unix console (when in text mode) for a blind person using a \
refreshable braille display. It drives the braille display and provides \
complete screen review functionality. \
 \
This package contains the BrlAPI braille driver."
LICENSE = "LGPL-2.1-or-later"

PV = "6.6"

RPM_NAME = "brltty-driver-brlapi-6.6-1.1.aarch64.rpm"
RPM_HASH = "11e39d9272ec86ba6b58aeb73c0f69703648074ad2821e37a1b3f1f16c897d816d0b57578e4ce72f00611631e2d5593ed4a807aed3ed1e22acb16b1de8a2fe5a"

RPROVIDES:${PN} += "brltty-driver-brlapi \
libbrlttybba.so"

RDEPENDS:${PN} += "brltty \
ld-linux-aarch64.so.1 \
libbrlapi.so.0.8 \
libc.so.6"

inherit rpm
