SUMMARY = "Warn whenever a float is placed 'to far away'"
DESCRIPTION = "The package checks for floats that are placed too far from \
their origin. It was motivated by a question on the question \
and answer page."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn27473"

RPM_NAME = "texlive-chkfloat-2023.201.0.0.1svn27473-53.1.noarch.rpm"
RPM_HASH = "43b835b68660c002b634537401df62e085b6da680a63b15cd1c2a8c2ff4eaa61a71386eda570a19c0c2745106bb5059a8658a9835c472c5d149924531987e091"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-chkfloat.sty \
texlive-chkfloat"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-kvoptions.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
