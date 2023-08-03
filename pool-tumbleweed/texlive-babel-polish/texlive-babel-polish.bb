SUMMARY = "Babel support for Polish"
DESCRIPTION = "The package provides the language definition file for support \
of Polish in babel. Some shortcuts are defined, as well as \
translations to Polish of standard 'LaTeX names'."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3svn62680"

RPM_NAME = "texlive-babel-polish-2023.209.1.3svn62680-54.1.noarch.rpm"
RPM_HASH = "2acdd15d1e11eb1021186dd80624dabbd10a8382a3064999e212b80c1d99e7ea77410f9715bfec96627d581ac8b5956043f95a0bf43fdbafb39058f5938a157b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-polish-compat.ldf \
tex-polish.ldf \
texlive-babel-polish"

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
