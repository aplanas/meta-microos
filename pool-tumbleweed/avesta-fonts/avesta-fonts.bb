SUMMARY = "Avestan Unicode Fonts"
DESCRIPTION = "The glyph outlines origin from Yasna 10 of the manuscript of Tehran University \
Library, nr. 11263. The scanned manuscript can be viewed under Ave976 on \
wwww.avesta-archive.org."
LICENSE = "OFL-1.1"

PV = "20121212"

RPM_NAME = "avesta-fonts-20121212-3.17.noarch.rpm"
RPM_HASH = "a7d44a8bd3e6072f6e3eca953d4b7541fb3fb862512553bb8626d60e046158f04b02a47388616b03fad3d445b2cd5656d0c1cbccd59881d848843943367ef22d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "avesta-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
