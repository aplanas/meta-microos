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

RPM_NAME = "oto-0.5-1.13.aarch64.rpm"
RPM_HASH = "c1cd72d405b22d451e1bb2ff3df3ea86dea0c7131d824d47b6138bd05f83ca6162c1a7e8b553997b1b48f1588804ee7db31b70e41c50526e81af24febc08083b"

RPROVIDES:${PN} += "oto"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
