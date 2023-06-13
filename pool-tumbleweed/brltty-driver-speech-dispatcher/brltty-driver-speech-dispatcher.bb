SUMMARY = "Speech Dispatcher driver for BRLTTY"
DESCRIPTION = "BRLTTY is a background process (daemon) which provides access to the \
Linux/Unix console (when in text mode) for a blind person using a \
refreshable braille display. It drives the braille display and provides \
complete screen review functionality. \
 \
This package contains the Speech Dispatcher speech driver."
LICENSE = "LGPL-2.1-or-later"

PV = "6.5"

RPM_NAME = "brltty-driver-speech-dispatcher-6.5-2.4.aarch64.rpm"
RPM_HASH = "7d9afc9856246a1151cea037dd8a900742f67a78febf2ef300ad25c9d68bd03011c050220b1d1ec10c6fde5c2c2f946a0127a10bf482da2346c8f8588f1649ce"

RPROVIDES:${PN} += "brltty-driver-speech-dispatcher \
brltty-driver-speech-dispatcher(aarch-64) \
libbrlttyssd.so()(64bit)"

RDEPENDS:${PN} += "brltty \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libspeechd.so.2()(64bit)"

inherit rpm
