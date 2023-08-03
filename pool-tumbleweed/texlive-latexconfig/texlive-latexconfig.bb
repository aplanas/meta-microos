SUMMARY = "Configuration files for LaTeX-related formats"
DESCRIPTION = "The latexconfig package"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn53525"

RPM_NAME = "texlive-latexconfig-2023.209.svn53525-55.1.noarch.rpm"
RPM_HASH = "9c899aa3e93997b5e54fb6825a5bcfda323d8cbf7d417445d10a0e288baa4d78cb61953591ea1fd805de4bfd98cf34a9f1ee921f3a9f80cb5ecde4bad187b2ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-epstopdf-sys.cfg \
tex-lualatexiniconfig.tex \
tex-lualatexquotejobname.tex \
texlive-latexconfig"

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
