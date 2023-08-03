SUMMARY = "Generic handling of TeX category codes"
DESCRIPTION = "The bundle deals with category code switching; the packages of \
the bundle should work with any TeX format (with the support of \
the plainpkg package). The bundle provides stacklet.sty, which \
supports stacks that control the use of different catcodes; \
actcodes.sty, which deals with active characters; and \
catchdq.sty, which provides a simple quotation character \
control mechanism."
LICENSE = "LPPL-1.0"

PV = "2023.209.r0.2svn38859"

RPM_NAME = "texlive-catcodes-2023.209.r0.2svn38859-53.1.noarch.rpm"
RPM_HASH = "c4393e8586f2153acfbc977461892d19eda4bf8dca346334743a6a4117983a63cdc5fda44148aab93ff158927b3efa62598d8c8df8ddd72617819bf66cca8698"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-actcodes.sty \
tex-catchdq.sty \
tex-stacklet.sty \
texlive-catcodes"

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
