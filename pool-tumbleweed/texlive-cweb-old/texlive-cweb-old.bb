SUMMARY = "Package cweb-old"
DESCRIPTION = "The cweb-old package"
LICENSE = "LPPL-1.0"

PV = "2023.204.svn49271"

RPM_NAME = "texlive-cweb-old-2023.204.svn49271-54.1.noarch.rpm"
RPM_HASH = "b4711bb4965e73e786b5285e4881d5525dc0f1f107214a1e44148ba3b8afaf4144afedd81409e719571167fb7715cc054b018e040dbadb75dea700cf21f39c12"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pdfXcwebmac.tex) \
tex(pdfcwebmac.tex) \
tex(pdfdcwebmac.tex) \
tex(pdffcwebmac.tex) \
tex(pdficwebmac.tex) \
tex(pdfwebmac.tex) \
texlive-cweb-old"

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
