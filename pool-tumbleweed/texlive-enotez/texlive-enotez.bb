SUMMARY = "Support for end-notes"
DESCRIPTION = "The package allows nested endnotes, supports hyperref and \
provides means for easy customization of the list of notes. The \
package requires the expl3 bundle and packages from the LaTeX 3 \
'package set'."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.10dsvn61490"

RPM_NAME = "texlive-enotez-2023.209.0.0.10dsvn61490-54.1.noarch.rpm"
RPM_HASH = "62024b5c032efcd4f5c6f4c6742ea621cc5def10fb7f1ce919043443fb423fd613f4e0cf7200c94e5b8b966b5be026a140ffca80fb89751bf5170fadab22e916"
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
