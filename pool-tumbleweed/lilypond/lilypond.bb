SUMMARY = "A typesetting system for music notation"
DESCRIPTION = "LilyPond is an automated music engraving system. It formats music \
beautifully and automatically, and has a friendly syntax for its input \
files."
LICENSE = "GPL-3.0-or-later"

PV = "2.24.1"

RPM_NAME = "lilypond-2.24.1-2.4.aarch64.rpm"
RPM_HASH = "28d4fd858b0dd8b92b2fde9434cdc89c36be4523f3940b0f78f78961d96a16d40bbf1c992b0f7c0366e06441a4c646afbc89c101b309187ca7eb8692c9154dba"

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
