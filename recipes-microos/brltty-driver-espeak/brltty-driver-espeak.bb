SUMMARY = "ESpeak driver for BRLTTY"
DESCRIPTION = "BRLTTY is a background process (daemon) which provides access to the \
Linux/Unix console (when in text mode) for a blind person using a \
refreshable braille display. It drives the braille display and provides \
complete screen review functionality. \
 \
This package contains the eSpeak speech driver."
LICENSE = "LGPL-2.1-or-later"

PV = "6.5"

RPM_NAME = "brltty-driver-espeak-6.5-2.4.aarch64.rpm"
RPM_HASH = "229d89aa94a03df7f250b7fffc46aa277f1c07611482b2a9efb869b2b8f86b7c3576bb9537b56c0508f2f604443f161cac73f78b4b70eb37b0f01a764d3f9d50"

RPROVIDES:${PN} += "brltty-driver-espeak brltty-driver-espeak(aarch-64) libbrlttyses.so()(64bit)"
RDEPENDS:${PN} += "brltty ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libespeak-ng.so.1()(64bit)"

inherit rpm
