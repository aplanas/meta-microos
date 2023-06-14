SUMMARY = "Automatically typeset the academic year (French way)"
DESCRIPTION = "This package provides a macro \\anneescolaire to automatically \
write the academic year in the French way, according to the \
date of compilation, two other macros to obtain the first and \
the second calendar year of the academic year, a macro to be \
redefined to change the presentation of the years."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.6svn55988"

RPM_NAME = "texlive-annee-scolaire-2023.201.1.6svn55988-54.1.noarch.rpm"
RPM_HASH = "a7d2447ef3bd0d0995f725c991408d2fad71bc7cfcedc466878eea2c92700bbd2a9e19a98cca7673f85288bebecc48db4142f7f7c0596208172fc8e20ece9dc2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-annee-scolaire.sty \
texlive-annee-scolaire"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-l3keys2e.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
