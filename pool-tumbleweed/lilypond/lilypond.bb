SUMMARY = "A typesetting system for music notation"
DESCRIPTION = "LilyPond is an automated music engraving system. It formats music \
beautifully and automatically, and has a friendly syntax for its input \
files."
LICENSE = "GPL-3.0-or-later"

PV = "2.24.1"

RPM_NAME = "lilypond-2.24.1-2.3.aarch64.rpm"
RPM_HASH = "81480e4f8bf96a94149df690901303185e768938e225d559e4f1e12aa78e6b7f419068e1836524c9f7ee6cc572b43d0b0df8641eb348149dd1cc534dfbec6d10"

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
