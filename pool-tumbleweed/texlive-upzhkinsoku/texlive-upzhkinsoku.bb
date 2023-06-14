SUMMARY = "Supplementary Chinese kinsoku for Unicode *pTeX"
DESCRIPTION = "This package provides supplementary Chinese kinsoku (line \
breaking rules etc.) settings for Unicode (e-)upTeX (when using \
Unicode as its internal encoding), and ApTeX. Both LaTeX and \
plain TeX are supported."
LICENSE = "SUSE-TeX"

PV = "2023.201.0.0.5svn47354"

RPM_NAME = "texlive-upzhkinsoku-2023.201.0.0.5svn47354-53.1.noarch.rpm"
RPM_HASH = "c1219917be652ebbdc9377a82a2b59d4a39633d5ace9fc91257157b3db5371b5299100a6e810ce05f340e5f6c60fbd9dc3928247ef4f06d0239095302d4a700d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-upzhkinsoku.sty \
texlive-upzhkinsoku"

RDEPENDS:${PN} += "/bin/sh \
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
