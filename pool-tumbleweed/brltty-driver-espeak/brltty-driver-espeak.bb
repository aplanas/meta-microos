SUMMARY = "ESpeak driver for BRLTTY"
DESCRIPTION = "BRLTTY is a background process (daemon) which provides access to the \
Linux/Unix console (when in text mode) for a blind person using a \
refreshable braille display. It drives the braille display and provides \
complete screen review functionality. \
 \
This package contains the eSpeak speech driver."
LICENSE = "LGPL-2.1-or-later"

PV = "6.5"

RPM_NAME = "brltty-driver-espeak-6.5-3.1.aarch64.rpm"
RPM_HASH = "c997dc8eccd5e993c80df05389448fc442835cb4c488a5982450efe1960938942e9ca7f70539643cb79369e14aebb817cee89d1f2cb579983d6e1ba26bed969e"

RPROVIDES:${PN} += "brltty-driver-espeak \
libbrlttyses.so"

RDEPENDS:${PN} += "brltty \
ld-linux-aarch64.so.1 \
libc.so.6 \
libespeak-ng.so.1"

inherit rpm
