SUMMARY = "Macros for commonly used physical units"
DESCRIPTION = "This package provides a collection of macros to simplify using \
physical units (e.g. m for meters, J for joules, etc.), \
especially in math mode. All major SI units are included, as \
well as some cgs units used in astronomy."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2.0svn58728"

RPM_NAME = "texlive-physunits-2023.201.1.2.0svn58728-51.1.noarch.rpm"
RPM_HASH = "1a4c453333c42c63d619e81719900275e3b291b7b72a0f5865c40686051e1e7be9e8e3dbe73d30f2665f8691b8b2e95f29ed39725fdfbf198d777a0c682ca70f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-physunits.sty \
texlive-physunits"

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
