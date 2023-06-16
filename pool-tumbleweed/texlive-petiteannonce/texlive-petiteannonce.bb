SUMMARY = "A class for small advertisements"
DESCRIPTION = "The class enables you to create the sort of adverts that you \
pin on a noticeboard, with tear-off strips at the bottom where \
you can place contact details."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0001svn25915"

RPM_NAME = "texlive-petiteannonce-2023.201.1.0001svn25915-51.1.noarch.rpm"
RPM_HASH = "986eb98fceff1e0f541b9e1f448a6953c47f9b77aef63132134e961191d6d7cb07b1824079d07cf28c918775a647b89d17c2856515833097882d20123a340779"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-petiteannonce.cls \
texlive-petiteannonce"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphicx.sty \
tex-keyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
