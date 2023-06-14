SUMMARY = "Babel support for Esperanto"
DESCRIPTION = "The package provides the language definition file for support \
of Esperanto in babel. Some shortcuts are defined, as well as \
translations to Esperanto of standard 'LaTeX names'."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4tsvn30265"

RPM_NAME = "texlive-babel-esperanto-2023.201.1.4tsvn30265-53.1.noarch.rpm"
RPM_HASH = "5cc51fd02eaddc7c7f65a1e6da92ebac9be954cb5a53b1109931af56ac436f8ccc7d60df8157408865ac4132aaff72d278359fe2e49baed2c66795438c8e5176"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-esperanto.ldf \
texlive-babel-esperanto"

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
