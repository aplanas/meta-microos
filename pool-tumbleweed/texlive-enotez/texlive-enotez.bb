SUMMARY = "Support for end-notes"
DESCRIPTION = "The package allows nested endnotes, supports hyperref and \
provides means for easy customization of the list of notes. The \
package requires the expl3 bundle and packages from the LaTeX 3 \
'package set'."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.10dsvn61490"

RPM_NAME = "texlive-enotez-2023.201.0.0.10dsvn61490-53.1.noarch.rpm"
RPM_HASH = "74a39abc49057f696a7089d341df0eb3901f2ff5b6e8cfc8950f8058edf87abe708d463ed9d88400b8661059ae5606f867ef8adb09f79dbc09b7b0cfe62f30b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(enotez.sty) \
texlive-enotez"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(expl3.sty) \
tex(l3keys2e.sty) \
tex(translations.sty) \
tex(xparse.sty) \
tex(xtemplate.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
