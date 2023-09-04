SUMMARY = "A typesetting system for music notation"
DESCRIPTION = "LilyPond is an automated music engraving system. It formats music \
beautifully and automatically, and has a friendly syntax for its input \
files."
LICENSE = "GPL-3.0-or-later"

PV = "2.24.2"

RPM_NAME = "lilypond-2.24.2-1.1.aarch64.rpm"
RPM_HASH = "984ab9e0a776cdab669f7556f9675799822b9c105ecb43bd3a8a4651856c1be5345cb0b9279647c17eb5d978f1d7d278f8d51507d06f235f0a0fb98238e5187d"

RPROVIDES:${PN} += "lilypond"

RDEPENDS:${PN} += "/usr/bin/python3 \
ghostscript \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfontconfig.so.1 \
libfreetype.so.6 \
libgc.so.1 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libguile-3.0.so.1 \
libm.so.6 \
libpango-1.0.so.0 \
libpangoft2-1.0.so.0 \
libstdc++.so.6 \
lilypond-fonts-common"

inherit rpm
