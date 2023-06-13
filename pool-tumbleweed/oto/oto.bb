SUMMARY = "Open Type Organizer"
DESCRIPTION = "The 'Open Type Organizer' project provides programs to list and modify \
tables in OpenType font files, specifically, their 'name' and 'cmap' \
tables.  It can be used to translate 'name' and 'cmap' of OpenType font \
in locale encodings to Unicode encoding so the font file can be used in \
an environment which does not understand locale encodings.  The \
translated tables are added to the font while keeping the original \
tables intact. \
 \
Do you have a True Type font which does not work with Xft (e.g. with \
KDE and Antialiasing)? Chances are, the font doesn't have a Unicode \
'cmap'!  Open Type Organizer (oTo) will help to solve the problem.  It \
will add Unicode 'name' and Unicode 'cmap' tables by translating the \
original ones.	Your favorite ttf font can really work for you now. \
 \
 \
 \
Authors: \
-------- \
    Yao Zhang <yaoz@users.sourceforge.net>"
LICENSE = "GPL-2.0-or-later"

PV = "0.5"

RPM_NAME = "oto-0.5-1.12.aarch64.rpm"
RPM_HASH = "1d6202f5850cf58e0860cc01a76f4c201954bc1140bf2f60d2b945ce421189574f32a5517046847cf2d497cac5883ac14d0616cc90193196e0ce764ef804bca0"

RPROVIDES:${PN} += "oto \
oto(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit)"

inherit rpm
