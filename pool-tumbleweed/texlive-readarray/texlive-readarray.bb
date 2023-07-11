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

PV = "2023.201.3.1svn60540"

RPM_NAME = "texlive-readarray-2023.201.3.1svn60540-53.2.noarch.rpm"
RPM_HASH = "31add5918e39adf6af928207b9e8668ba8632275978e88e6b5c6ad07fdc748aa1b3f45389561c8fd576577d26fd03e53f91f6ca1552ed3aeb4ebb871cd113a30"
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
