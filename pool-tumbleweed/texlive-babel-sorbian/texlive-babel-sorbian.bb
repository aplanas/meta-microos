SUMMARY = "Babel support for Upper and Lower Sorbian"
DESCRIPTION = "The package provides language definitions file for support of \
both Upper and Lower Sorbian, in babel. Some shortcuts are \
defined, as well as translations to the relevant language of \
standard 'LaTeX names'."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0jsvn60975"

RPM_NAME = "texlive-babel-sorbian-2023.209.1.0jsvn60975-54.1.noarch.rpm"
RPM_HASH = "75ad667b1ff660171e9d5dcb49c75ef543c82449049011b6eddf18276cb17faff705ee0ceb8c8dc0186fdf25872717138d7447146541ec531ea42f74f3fcb83d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lsorbian.ldf \
tex-usorbian.ldf \
texlive-babel-sorbian"

RDEPENDS:${PN} += "/usr/bin/sh \
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
