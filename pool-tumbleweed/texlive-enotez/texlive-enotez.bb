SUMMARY = "Support for end-notes"
DESCRIPTION = "The package allows nested endnotes, supports hyperref and \
provides means for easy customization of the list of notes. The \
package requires the expl3 bundle and packages from the LaTeX 3 \
'package set'."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.10dsvn61490"

RPM_NAME = "texlive-enotez-2023.209.0.0.10dsvn61490-54.2.noarch.rpm"
RPM_HASH = "1d6c073d3ee4692e65553f12d4c1c94c06c62094aeb0e0e42ced23c7cc0e2fc547214100c98f1bccbff2beb322cdcfc0ede3552475a988772ccb53e8f1c6b2ac"
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
