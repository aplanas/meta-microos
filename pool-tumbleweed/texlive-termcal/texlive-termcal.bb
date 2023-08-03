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

PV = "2023.209.1.8svn22514"

RPM_NAME = "texlive-termcal-2023.209.1.8svn22514-55.1.noarch.rpm"
RPM_HASH = "482e338fa509d4cfb5b2b6eac706335a89e7b9f6966a7ff22d79679e02fe514d7fad174cd7aebf0c891a91038ebd75f27fa06aaac8eafa29573b7745f7f80d62"
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
