SUMMARY = "ESpeak driver for BRLTTY"
DESCRIPTION = "BRLTTY is a background process (daemon) which provides access to the \
Linux/Unix console (when in text mode) for a blind person using a \
refreshable braille display. It drives the braille display and provides \
complete screen review functionality. \
 \
This package contains the eSpeak speech driver."
LICENSE = "LGPL-2.1-or-later"

PV = "6.5"

RPM_NAME = "brltty-driver-espeak-6.5-2.3.aarch64.rpm"
RPM_HASH = "c57f6c18fef44beaf79674756b4a9db3f94c5c1639db865b38d40a25c027c29d0500d2d2ab79c899f1c4db9e19a033fda8080bea4ea0e21f47d307fe54feab3c"

RPROVIDES:${PN} += "brltty-driver-espeak brltty-driver-espeak(aarch-64) libbrlttyses.so()(64bit)"
RDEPENDS:${PN} += "brltty ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libespeak-ng.so.1()(64bit)"

inherit rpm
