SUMMARY = "Typeset autosegmental representations for linguists"
DESCRIPTION = "The package allows the user to typeset autosegmental \
representations. It uses the PStricks, and xkeyval packages."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn22138"

RPM_NAME = "texlive-pst-asr-2023.201.1.3svn22138-52.1.noarch.rpm"
RPM_HASH = "f9bd6ad7209e1d787848cefe102e8770ec2a3eb2867d12c73f9d84da323b9472807bcd037869f5105dc7818e05fb48b7cb031f9064ace9d03e14a87c80ca866b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pst-asr.sty) \
tex(pst-asr.tex) \
texlive-pst-asr"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(pst-xkey.sty) \
tex(pstricks.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
