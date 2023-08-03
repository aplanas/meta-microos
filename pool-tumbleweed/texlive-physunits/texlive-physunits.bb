SUMMARY = "Macros for commonly used physical units"
DESCRIPTION = "This package provides a collection of macros to simplify using \
physical units (e.g. m for meters, J for joules, etc.), \
especially in math mode. All major SI units are included, as \
well as some cgs units used in astronomy."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2.0svn58728"

RPM_NAME = "texlive-physunits-2023.209.1.2.0svn58728-52.1.noarch.rpm"
RPM_HASH = "cf253cd7e38a78b95bb51485cc389d2849b0ae9fda3217fba18c2d8ff8c12612da326ede75b9c176b942534316d75b3bd0365997937e299c2afe6e0740a77c91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-physunits.sty \
texlive-physunits"

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
