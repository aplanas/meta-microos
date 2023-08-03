SUMMARY = "Commands for using Asymptote figures"
DESCRIPTION = "The package provides a means of reading Asymptote figures from \
separate files, rather than within the document, as is standard \
in the asymptote package, which is provided as part of the \
Asymptote bundle. The asymptote way can prove cumbersome in a \
large document; the present package allows the user to process \
one picture at a time, in simple test documents, and then to \
migrate (with no fuss) to their use in the target document."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1csvn17512"

RPM_NAME = "texlive-asyfig-2023.209.0.0.1csvn17512-54.1.noarch.rpm"
RPM_HASH = "823288223730eaaa96170f9b1f98bf70834e3371a382d6c65ba2f6f22da4804e08494d412a3de65fb945d5e7311db65492984141529c42351e715eb01d814de5"
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
