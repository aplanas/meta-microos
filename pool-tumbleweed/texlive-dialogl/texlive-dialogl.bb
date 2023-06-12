SUMMARY = "Macros for constructing interactive LaTeX scripts"
DESCRIPTION = "Gathers together a bunch of code and examples about how to \
write macros to carry on a dialogue with the user."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn28946"

RPM_NAME = "texlive-dialogl-2023.201.svn28946-52.1.noarch.rpm"
RPM_HASH = "7111fe08bd3c6af6994269a54cd810c264d874002e6410e3d716b0e327457137d3ba8f6a9dd18decc93491cf647786e87ca6dd1adaa333421f0612e99b0143a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(dialog.sty) \
tex(grabhedr.sty) \
tex(listout.tex) \
tex(menus.sty) \
texlive-dialogl"
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
