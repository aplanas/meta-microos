SUMMARY = "Variable M PLUS 1 Code font"
DESCRIPTION = "A monospaced variable font combining full-width Japanese glyphs \
(shared with M PLUS 1) and half-width alphanumeric glyphs \
(shared with M PLUS Code Latin 50 described below)."
LICENSE = "OFL-1.1"

PV = "20230116"

RPM_NAME = "mplus1-code-variable-fonts-20230116-1.1.noarch.rpm"
RPM_HASH = "d2b1ee64a6f6034251ec69b92267c26b964f75c110c50fb9a02ce4096f2ef0b512528f179d6d57563cdde5213c37a74e6cb531f67c48cd334a791785cbeb5a77"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mplus1-code-variable-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
