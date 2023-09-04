SUMMARY = "Magyar language module for glossaries package"
DESCRIPTION = "Magyar language module for glossariesr package."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn35665"

RPM_NAME = "texlive-glossaries-magyar-2023.209.1.0svn35665-54.2.noarch.rpm"
RPM_HASH = "49c32b73247caa45d824fb1332a9dad58a358c23fccce172cacbe1b492847d4ab8f968c74620f1dbd540d906172e2aa3e40a3e8909890b0591220d86f04b3e4f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-glossaries-magyar-noenc.ldf \
tex-glossaries-magyar-utf8.ldf \
tex-glossaries-magyar.ldf \
texlive-glossaries-magyar"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
