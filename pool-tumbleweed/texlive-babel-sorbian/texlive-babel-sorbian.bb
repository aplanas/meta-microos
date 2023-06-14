SUMMARY = "Babel support for Upper and Lower Sorbian"
DESCRIPTION = "The package provides language definitions file for support of \
both Upper and Lower Sorbian, in babel. Some shortcuts are \
defined, as well as translations to the relevant language of \
standard 'LaTeX names'."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0jsvn60975"

RPM_NAME = "texlive-babel-sorbian-2023.201.1.0jsvn60975-53.1.noarch.rpm"
RPM_HASH = "f3244e3ebbaeff25f065d7721ebf10a3dbdd7c364103ca8d6ccfd2cb14246c2d8caa78a77af7653071ebcac0a2aa8b0a4e3500a6763e87ad3bb9621a3b3a59d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lsorbian.ldf \
tex-usorbian.ldf \
texlive-babel-sorbian"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
