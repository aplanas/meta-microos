SUMMARY = "Support for end-notes"
DESCRIPTION = "The package allows nested endnotes, supports hyperref and \
provides means for easy customization of the list of notes. The \
package requires the expl3 bundle and packages from the LaTeX 3 \
'package set'."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.10dsvn61490"

RPM_NAME = "texlive-enotez-2023.201.0.0.10dsvn61490-53.2.noarch.rpm"
RPM_HASH = "9144a08b7bc84e5fafeb49a6053976e5a5e160f51281055225e7cc85f3631f980cd38c57b13efdb443049ac79fbc60a28abe10d06e49200c782ddf126c6434d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-enotez.sty \
texlive-enotez"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-l3keys2e.sty \
tex-translations.sty \
tex-xparse.sty \
tex-xtemplate.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
