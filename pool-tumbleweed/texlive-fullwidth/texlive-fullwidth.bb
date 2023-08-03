SUMMARY = "Adjust margins of text block"
DESCRIPTION = "The package provides the environment fullwidth, which sets the \
left and right margins in a simple way. There is no constraint \
about page breaks; if you are using the twoside mode, you can \
set the inner and outer margins to avoid the effects of the \
different margins."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn24684"

RPM_NAME = "texlive-fullwidth-2023.209.0.0.1svn24684-53.1.noarch.rpm"
RPM_HASH = "4ce5ad0fc797bc6852252b7173bd281f97784bfe3fb3c136a540ac69546b2f635edff535a65beccb6e932a2bb99cb0c687b89d057b6ae13153993b5d78488f42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fullwidth.sty \
texlive-fullwidth"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-kvoptions.sty \
tex-zref-abspage.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
