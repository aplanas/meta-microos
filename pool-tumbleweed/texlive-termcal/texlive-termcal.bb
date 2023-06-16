SUMMARY = "Print a class calendar"
DESCRIPTION = "This package is intended to print a term calendar for use in \
planning a class. It has a flexible mechanism for specifying \
which days of the week are to be included and for inserting \
text either regularly on the same day each week, or on selected \
days, or for a series of consecutive days. It also has a \
flexible mechanism for specifing class and nonclass days. Text \
may be inserted into consecutive days so that it automatically \
flows around nonclass days."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.8svn22514"

RPM_NAME = "texlive-termcal-2023.201.1.8svn22514-54.1.noarch.rpm"
RPM_HASH = "5e27f9f857ee72cd04c554292820e93475c7aea35fe23941e732692f2839faa76951089725efb6e0ec5739831f8e2116398e7e34f4e5eec3ef7dc4933e3ba71a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-termcal.sty \
texlive-termcal"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-longtable.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
