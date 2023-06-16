SUMMARY = "Typesetting bracketed dichotomous identification keys"
DESCRIPTION = "The package is for typesetting bracketed dichotomous \
identification keys."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.1.0svn61719"

RPM_NAME = "texlive-identkey-2023.201.0.0.1.0svn61719-52.1.noarch.rpm"
RPM_HASH = "d9e1b29de694b4211b4b12e99c97242f76a982347244661302f94c4bc0f6aba6f0b240a367cf977cf043244dfaa558e5a318f3f0498401a777c08b55a7a125d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-identkey.sty \
texlive-identkey"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-enumitem.sty \
tex-etoolbox.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
