SUMMARY = "ESpeak driver for BRLTTY"
DESCRIPTION = "BRLTTY is a background process (daemon) which provides access to the \
Linux/Unix console (when in text mode) for a blind person using a \
refreshable braille display. It drives the braille display and provides \
complete screen review functionality. \
 \
This package contains the eSpeak speech driver."
LICENSE = "LGPL-2.1-or-later"

PV = "6.6"

RPM_NAME = "brltty-driver-espeak-6.6-1.1.aarch64.rpm"
RPM_HASH = "3444552778f81435f9b4dbdefc5a7547556adf855feacf213146f97231de9ede0a26f1c19765d1d5f7147d41e3c23709f1fa0b8bec041192a231fe4724e57934"

RPROVIDES:${PN} += "brltty-driver-espeak \
libbrlttyses.so"

RDEPENDS:${PN} += "brltty \
ld-linux-aarch64.so.1 \
libc.so.6 \
libespeak-ng.so.1"

inherit rpm
