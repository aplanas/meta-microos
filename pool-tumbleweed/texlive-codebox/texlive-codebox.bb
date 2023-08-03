SUMMARY = "Highlighted source code in a fancy box"
DESCRIPTION = "This LaTeX3 package provides environments codebox and codeview \
to typset with an environment body, and macros \\codefile and \
\\cvfile to typeset programming source code from a file in a \
fancy box. Starred versions of these environments and macros \
are provided to add a comment at the bottom of the fancy box. \
The package is based on tcolorbox, minted, and listings."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.4svn61771"

RPM_NAME = "texlive-codebox-2023.209.1.0.4svn61771-54.1.noarch.rpm"
RPM_HASH = "cdf86546bf030f9d1e5cffa9f7fd1179fb57bbc8eaf761ef20596eb4ddd169cb3125768e1bbc0209cb500ef27a23193a9c6111902dcbfedb140886a2a6e5b939"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-codebox.sty \
texlive-codebox"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-expl3.sty \
tex-fontawesome5.sty \
tex-l3keys2e.sty \
tex-tcolorbox.sty \
tex-varwidth.sty \
tex-xcolor.sty \
tex-xparse.sty \
tex-xtemplate.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
