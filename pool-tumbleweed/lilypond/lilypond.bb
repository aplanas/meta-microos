SUMMARY = "A typesetting system for music notation"
DESCRIPTION = "LilyPond is an automated music engraving system. It formats music \
beautifully and automatically, and has a friendly syntax for its input \
files."
LICENSE = "GPL-3.0-or-later"

PV = "2.24.1"

RPM_NAME = "lilypond-2.24.1-2.3.aarch64.rpm"
RPM_HASH = "81480e4f8bf96a94149df690901303185e768938e225d559e4f1e12aa78e6b7f419068e1836524c9f7ee6cc572b43d0b0df8641eb348149dd1cc534dfbec6d10"

RPROVIDES:${PN} += "lilypond \
lilypond(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/python3 \
ghostscript \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libfontconfig.so.1()(64bit) \
libfreetype.so.6()(64bit) \
libgc.so.1()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libguile-3.0.so.1()(64bit) \
libm.so.6()(64bit) \
libpango-1.0.so.0()(64bit) \
libpangoft2-1.0.so.0()(64bit) \
libstdc++.so.6()(64bit) \
lilypond-fonts-common"

inherit rpm
