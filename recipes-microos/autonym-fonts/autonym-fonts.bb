SUMMARY = "A font that can render all language autonyms"
DESCRIPTION = "If we want to show a large number of languages written in their own scripts \
(autonyms), we cannot apply the usual webfonts to it. This is because since \
each script require a webfonts, we will end up in using a large number of \
webfonts. This can cause large bandwidth usage. \
 \
Autonym font tries to solve this. The font contains glyphs and opentype rules \
for rendering the language autonyms. And it contains only those glyphs for a \
language. For example, for Thai, the font has glyphs required for rendering ไทย \
alone."
LICENSE = "OFL-1.1"

PV = "1.0"

RPM_NAME = "autonym-fonts-1.0-3.17.noarch.rpm"
RPM_HASH = "34fa0cfa237215d6ac7bcee80a4d851e56edb6cdce42960316ea42a74477edaed28920027602be23344f09db43c4c0cba40bf84db495a6e07621eabda83c7c08"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "autonym-fonts"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
