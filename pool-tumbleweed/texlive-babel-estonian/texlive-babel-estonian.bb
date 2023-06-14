SUMMARY = "Babel support for Estonian"
DESCRIPTION = "The package provides the language definition file for support \
of Estonian in babel. Some shortcuts are defined, as well as \
translations to Estonian of standard 'LaTeX names'."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1asvn38064"

RPM_NAME = "texlive-babel-estonian-2023.201.1.1asvn38064-53.1.noarch.rpm"
RPM_HASH = "6b00c39ddd0f2952892513fa4cf9225f66d4824a739f5d4bef8a751b8ffb3d26707532319af259e09a368a47dcd256dae292a435e51152fd5a59e8395ed9a916"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-estonian.ldf \
texlive-babel-estonian"

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
