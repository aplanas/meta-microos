SUMMARY = "Make letter-sized pages of labels"
DESCRIPTION = "The package provides controls for the numbers of rows and \
columns."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn24858"

RPM_NAME = "texlive-jlabels-2023.201.svn24858-55.1.noarch.rpm"
RPM_HASH = "c04909e83ac61bba0f29f4ec02cde51ddc0e76bc0a38683252ebb617fb5f35e2b8e876b4d57616e7f15b885eee67f5340c3771b420a7ae5518b2df5524ec5ab6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(jlabels.sty) \
texlive-jlabels"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(calc.sty) \
tex(etoolbox.sty) \
tex(ifthen.sty) \
tex(pstricks.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
