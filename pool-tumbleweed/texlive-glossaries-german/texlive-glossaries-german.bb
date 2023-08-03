SUMMARY = "German language module for glossaries package"
DESCRIPTION = "German language module for the glossaries package."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn35665"

RPM_NAME = "texlive-glossaries-german-2023.209.1.0svn35665-54.1.noarch.rpm"
RPM_HASH = "7621fce5a4601294b480dc6d67871c91233ddcb6bb12835ce2783876774bfed6a66827d34536fa344ced31a8dafc31707668e1c15d38aec4bb169e5a64993650"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-glossaries-german.ldf \
texlive-glossaries-german"

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
