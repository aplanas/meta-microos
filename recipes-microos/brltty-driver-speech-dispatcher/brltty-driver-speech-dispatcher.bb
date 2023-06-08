SUMMARY = "Speech Dispatcher driver for BRLTTY"
DESCRIPTION = "BRLTTY is a background process (daemon) which provides access to the \
Linux/Unix console (when in text mode) for a blind person using a \
refreshable braille display. It drives the braille display and provides \
complete screen review functionality. \
 \
This package contains the Speech Dispatcher speech driver."
LICENSE = "LGPL-2.1-or-later"

PV = "6.5"

RPM_NAME = "brltty-driver-speech-dispatcher-6.5-2.3.aarch64.rpm"
RPM_HASH = "9a1da789a65bc360638234c1b5d3378a0363bef8caeadd33c80d1ab460e1c66820c2bcc5bd50721988222f08710003774a28be31b6bc3474bbcf509d8e949fe4"

RPROVIDES:${PN} += "brltty-driver-speech-dispatcher brltty-driver-speech-dispatcher(aarch-64) libbrlttyssd.so()(64bit)"
RDEPENDS:${PN} += "brltty ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libspeechd.so.2()(64bit)"

inherit rpm
