SUMMARY = "Simple CSV file processing"
DESCRIPTION = "The package provides a simple LaTeX interface for the \
processing of files with comma separated values (CSV); it \
relies on the key value syntax supported by pgfkeys to simplify \
usage. Filtering and table generation are especially supported; \
however, this lightweight tool offers no support for data \
sorting or data base storage. The package depends on etoolbox, \
ifthen, pgfrcs, pgfkeys, and shellesc."
LICENSE = "LPPL-1.0"

PV = "2023.204.2.3.2svn64450"

RPM_NAME = "texlive-csvsimple-2023.204.2.3.2svn64450-54.1.noarch.rpm"
RPM_HASH = "9acb5373c9328506347ce7080171febd39ac5000444579724e64886e9c0d6ea6dc6eb9f40a4afb0fdf3923cfe0f3d5b712ee0e8a41d0d2470d036f743bff0f69"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(csvsimple-l3.sty) \
tex(csvsimple-legacy.sty) \
tex(csvsimple.sty) \
texlive-csvsimple"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(etoolbox.sty) \
tex(ifthen.sty) \
tex(l3keys2e.sty) \
tex(pgfkeys.sty) \
tex(pgfrcs.sty) \
tex(shellesc.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
