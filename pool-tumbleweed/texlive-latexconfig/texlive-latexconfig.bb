SUMMARY = "Configuration files for LaTeX-related formats"
DESCRIPTION = "The latexconfig package"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn53525"

RPM_NAME = "texlive-latexconfig-2023.201.svn53525-54.1.noarch.rpm"
RPM_HASH = "354178cf157048adac53309fc54b987719e4099c96f5bff4be0f33b44338260a60495760b72d9b60ac6a96ba54eed53767a10667302d8d217809090d82fa2ea0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(epstopdf-sys.cfg) \
tex(lualatexiniconfig.tex) \
tex(lualatexquotejobname.tex) \
texlive-latexconfig"

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
