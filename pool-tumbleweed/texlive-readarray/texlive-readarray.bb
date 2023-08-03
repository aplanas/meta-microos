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

RPM_NAME = "texlive-readarray-2023.209.3.1svn60540-54.1.noarch.rpm"
RPM_HASH = "07e83d42f46e283348519b7312c5f0c748f7e5a1fa0d9d9e76b72abbe5c460ab54065afc26768074316a18661516339db091d1a56fcba6391c817036b0e376ec"
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
