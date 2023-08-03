SUMMARY = "Macros for IAG symposium papers"
DESCRIPTION = "This package provides (re-)definitions of some LaTeX commands \
that can be useful for the preparation of papers with the style \
of the proceedings of symposia sponsored by the 'International \
Association of Geodesy (IAG)' published by Springer-Verlag."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn63242"

RPM_NAME = "texlive-prociagssymp-2023.209.svn63242-53.1.noarch.rpm"
RPM_HASH = "8007a551cce7b2318745331b566bc63a5c69b6749cd21f90e546c815773bd1e134f985c9e77e4430d2ad467c997d2b2c671aba2ae9fb3104ebc27c40645e7fb2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-procIAGssymp.sty \
texlive-prociagssymp"

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
