SUMMARY = "A fast LaTeX to HTML translator"
DESCRIPTION = "HEVEA is a LaTeX to HTML translator.  The input language is a fairly \
complete subset of LaTeX2e (old LaTeX style is also accepted) and \
the output language is HTML."
LICENSE = "LGPL-2.0-only & QPL-1.0"

PV = "2.36"

RPM_NAME = "hevea-2.36-1.8.aarch64.rpm"
RPM_HASH = "17c48850f3f343a2cb5c0b24056a27acbb886a7bbc4c71a5ddd4b2751443acdf7b1b2537c835a66e963bae21bac66f50ea654e941a55f974f4ae60022fc6a7c8"

RPROVIDES:${PN} += "hevea"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6 \
libm.so.6"

inherit rpm
