SUMMARY = "Commands for using Asymptote figures"
DESCRIPTION = "The package provides a means of reading Asymptote figures from \
separate files, rather than within the document, as is standard \
in the asymptote package, which is provided as part of the \
Asymptote bundle. The asymptote way can prove cumbersome in a \
large document; the present package allows the user to process \
one picture at a time, in simple test documents, and then to \
migrate (with no fuss) to their use in the target document."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1csvn17512"

RPM_NAME = "texlive-asyfig-2023.201.0.0.1csvn17512-53.1.noarch.rpm"
RPM_HASH = "461c4e305c1b9a3b47e47438a6a1bfde51a21d1a4b0f463d1270ffea684ef038aad8e667cb796271c8ae0ec33dc79ecc7f3c6001670817987b719b44e57fef37"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-asyalign.sty \
tex-asyfig.sty \
tex-asyprocess.sty \
texlive-asyfig"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-catchfile.sty \
tex-color.sty \
tex-graphicx.sty \
tex-ifmtarg.sty \
tex-ifpdf.sty \
tex-ifplatform.sty \
tex-preview.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
