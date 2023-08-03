SUMMARY = "Simple CSV file processing"
DESCRIPTION = "The package provides a simple LaTeX interface for the \
processing of files with comma separated values (CSV); it \
relies on the key value syntax supported by pgfkeys to simplify \
usage. Filtering and table generation are especially supported; \
however, this lightweight tool offers no support for data \
sorting or data base storage. The package depends on etoolbox, \
ifthen, pgfrcs, pgfkeys, and shellesc."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.3.2svn64450"

RPM_NAME = "texlive-csvsimple-2023.209.2.3.2svn64450-55.1.noarch.rpm"
RPM_HASH = "c5ce57147ffb05c9a3ea8b45167532e6ae81e363bddcb80023be91408627dceeceed85b8b74f192b792d46570e771525ada90c7a38ac2ca3837b0d0133b30009"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-csvsimple-l3.sty \
tex-csvsimple-legacy.sty \
tex-csvsimple.sty \
texlive-csvsimple"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-ifthen.sty \
tex-l3keys2e.sty \
tex-pgfkeys.sty \
tex-pgfrcs.sty \
tex-shellesc.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
