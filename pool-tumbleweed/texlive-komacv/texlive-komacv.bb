SUMMARY = "Typesetting a beautiful CV with various style options"
DESCRIPTION = "The class simplifies the creation of beautiful CV. The user may \
choose between different styles, and may adjust settings to \
tune the output."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1.2svn57721"

RPM_NAME = "texlive-komacv-2023.201.1.1.2svn57721-55.1.noarch.rpm"
RPM_HASH = "400eadb896e36216fec349d762f7f89675c5671964fcc8d83a954863c818a10b39cd84b5b48b143cc1e4b5f8028c0c0eed1adcf5d11722496ee8c40a4f8bbcf9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-komacv-casual.sty \
tex-komacv-classic.sty \
tex-komacv-oldstyle.sty \
tex-komacv.cls \
texlive-komacv"

RDEPENDS:${PN} += "/bin/sh \
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
