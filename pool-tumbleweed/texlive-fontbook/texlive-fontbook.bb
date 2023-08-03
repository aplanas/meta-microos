SUMMARY = "Generate a font book"
DESCRIPTION = "The package provides a means of producing a 'book' of font \
samples (for evaluation, etc.)."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn23608"

RPM_NAME = "texlive-fontbook-2023.209.0.0.2svn23608-53.1.noarch.rpm"
RPM_HASH = "863ebc93c64cf6511d1e1cf105ef90f33144753d049cc1c0a3decf7dce985032cbbbb7d852d967da84dfa9629067ac66fd70b1d24ff12ab3351b65e64809aaba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fontbook.sty \
texlive-fontbook"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-fontspec.sty \
tex-kvoptions.sty \
tex-xunicode.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
