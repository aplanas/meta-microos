SUMMARY = "Babel support for Icelandic"
DESCRIPTION = "The package provides the language definition file for support \
of Icelandic in babel. Some shortcuts are defined, as well as \
translations to Icelandic of standard 'LaTeX names'."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn51551"

RPM_NAME = "texlive-babel-icelandic-2023.201.1.3svn51551-53.1.noarch.rpm"
RPM_HASH = "42f5a3870c5017ef7be156dbdfde8e21724e1d669dc28dc4d8f3f96948c9d9a2e6fecd683e6867093caaa76be7382660b69dd7e45eb365de3e229c27d384c6df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-icelandic.ldf \
texlive-babel-icelandic"

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
