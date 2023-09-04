SUMMARY = "Read, store and recall array-formatted data"
DESCRIPTION = "The package allows the user to input formatted data into \
elements of a 2-D or 3-D array and to recall that data at will \
by individual cell number. The data can be but need not be \
numerical in nature. It can be, for example, formatted text. \
While the package can be used for any application where indexed \
data is called for, the package proves particularly useful when \
elements of multiple arrays must be recallable and dynamically \
combined at time of compilation, rather than in advance."
LICENSE = "LPPL-1.0"

PV = "2023.209.3.1svn60540"

RPM_NAME = "texlive-readarray-2023.209.3.1svn60540-54.2.noarch.rpm"
RPM_HASH = "d6f60d0f97866d60d45c234d569355df9ae89fb56fab4d19a8a838afb9c6e776fe8a4f1a53010a8a3eca9206747fb77b9fcd0579596d9671d1e1739c4bb66c64"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-readarray.sty \
texlive-readarray"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-forloop.sty \
tex-ifthen.sty \
tex-listofitems.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
