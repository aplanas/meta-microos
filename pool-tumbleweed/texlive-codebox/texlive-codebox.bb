SUMMARY = "Highlighted source code in a fancy box"
DESCRIPTION = "This LaTeX3 package provides environments codebox and codeview \
to typset with an environment body, and macros \\codefile and \
\\cvfile to typeset programming source code from a file in a \
fancy box. Starred versions of these environments and macros \
are provided to add a comment at the bottom of the fancy box. \
The package is based on tcolorbox, minted, and listings."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.4svn61771"

RPM_NAME = "texlive-codebox-2023.201.1.0.4svn61771-53.1.noarch.rpm"
RPM_HASH = "790eab0a1f10a5d96a9710e09e85e5bcbcacc91fb30988c29e557dd29eeb8351dbae800174f440c0f19e6fd7bef39c7281fb3dfa099c3000acbee38fee609e1f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(codebox.sty) \
texlive-codebox"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(etoolbox.sty) \
tex(expl3.sty) \
tex(fontawesome5.sty) \
tex(l3keys2e.sty) \
tex(tcolorbox.sty) \
tex(varwidth.sty) \
tex(xcolor.sty) \
tex(xparse.sty) \
tex(xtemplate.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
