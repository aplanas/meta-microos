SUMMARY = "Create a frontispiece for Italian theses"
DESCRIPTION = "Typesetting a frontispiece independently of the layout of the \
main document is difficult. This package provides a solution by \
producing an auxiliary TeX file to be typeset on its own and \
the result is automatically included at the next run. The \
markup necessary for the frontispiece is written in the main \
document in a frontespizio environment. Documentation is mainly \
in Italian, as the style is probably apt only to theses in \
Italy."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4asvn24054"

RPM_NAME = "texlive-frontespizio-2023.209.1.4asvn24054-53.1.noarch.rpm"
RPM_HASH = "fb3dfc86796eaf8b52abb29f48975e2a8868c549d9f91c699c56cc7ae3ab3fa8fd5ada82e11172a72b044ee2edde7a7f22b488a8975f10a51ac61c01a7ee5265"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-frontespizio.sty \
texlive-frontespizio"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-afterpage.sty \
tex-atbegshi.sty \
tex-environ.sty \
tex-graphicx.sty \
tex-ifpdf.sty \
tex-ifxetex.sty \
tex-inputenc.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
