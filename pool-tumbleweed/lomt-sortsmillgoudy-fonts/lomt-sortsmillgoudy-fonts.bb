SUMMARY = "League Of Movable Type's 'Sorts Mill Goudy' font family"
DESCRIPTION = "A 'revival' of Goudy Oldstyle and Italic, with features including \
small capitals (in the roman only), oldstyle and lining figures, \
superscripts and subscripts, fractions, ligatures, class-based \
kerning, case-sensitive forms, and capital spacing. There is support \
for many languages using Latin scripts."
LICENSE = "OFL-1.1"

PV = "0.20121218"

RPM_NAME = "lomt-sortsmillgoudy-fonts-0.20121218-8.7.noarch.rpm"
RPM_HASH = "419e5f4e0d419f1c377d0bfece145788ee0082f1a2b31b08a75ced104ae7cbe058a3fd926e3d4035bd402200a38c3e24050148b6171a977b9ad9a024e1363124"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lomt-sortsmillgoudy-fonts"

RDEPENDS:${PN} += "/bin/sh"

inherit rpm
