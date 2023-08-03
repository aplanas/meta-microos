SUMMARY = "Typesetting a beautiful CV with various style options"
DESCRIPTION = "The class simplifies the creation of beautiful CV. The user may \
choose between different styles, and may adjust settings to \
tune the output."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1.2svn57721"

RPM_NAME = "texlive-komacv-2023.209.1.1.2svn57721-56.1.noarch.rpm"
RPM_HASH = "88062b891fc1fcf51cef6313e890695a53ba2349f25b2a4c76dbb8ced9571e3beac3de2324a8c749e25d91395e1b569a3c6b21348b4ead1a2cb9568353eea7f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-komacv-casual.sty \
tex-komacv-classic.sty \
tex-komacv-oldstyle.sty \
tex-komacv.cls \
texlive-komacv"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-fontawesome.sty \
tex-fontenc.sty \
tex-fontspec.sty \
tex-ifthen.sty \
tex-inputenc.sty \
tex-kvoptions.sty \
tex-lastpage.sty \
tex-ragged2e.sty \
tex-scrartcl.cls \
tex-xcolor.sty \
tex-xparse.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
