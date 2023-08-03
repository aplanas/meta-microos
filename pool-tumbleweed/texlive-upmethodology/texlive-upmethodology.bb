SUMMARY = "Writing specifications such as for UP-based methodologies"
DESCRIPTION = "The bundle allows the user to create Unified Process \
methodology (UP or RUP) based documents. The style provides \
document versioning, document history, document authors, \
document validators, specification description, task \
management, and several helping macros."
LICENSE = "LGPL-2.1-or-later"

PV = "2023.209.20221004svn64613"

RPM_NAME = "texlive-upmethodology-2023.209.20221004svn64613-54.1.noarch.rpm"
RPM_HASH = "7be423e805977d14eff11a211fc5fadd0beb269719e4063e51bdfef549bb16684c2aa7735dc0726f8fbdadea918b41feb862e89fbe52efd3fd42129908b7a22d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-UPMVERSION.def \
tex-upmethodology-backpage.sty \
tex-upmethodology-code.sty \
tex-upmethodology-document.cls \
tex-upmethodology-document.sty \
tex-upmethodology-extension.sty \
tex-upmethodology-fmt.sty \
tex-upmethodology-frontpage.sty \
tex-upmethodology-p-common.sty \
tex-upmethodology-spec.sty \
tex-upmethodology-task.sty \
tex-upmethodology-version.sty \
texlive-upmethodology"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-a4wide.sty \
tex-amsmath.sty \
tex-amsthm.sty \
tex-babel.sty \
tex-bbm.sty \
tex-colortbl.sty \
tex-draftwatermark.sty \
tex-environ.sty \
tex-graphicx.sty \
tex-hyphenat.sty \
tex-ifpdf.sty \
tex-ifthen.sty \
tex-multicol.sty \
tex-picinpar.sty \
tex-pifont.sty \
tex-relsize.sty \
tex-setspace.sty \
tex-subcaption.sty \
tex-tabularx.sty \
tex-thmtools.sty \
tex-txfonts.sty \
tex-ulem.sty \
tex-url.sty \
tex-varioref.sty \
tex-vmargin.sty \
tex-xcolor.sty \
tex-xkeyval.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
