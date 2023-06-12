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

RPM_NAME = "texlive-readarray-2023.201.3.1svn60540-53.1.noarch.rpm"
RPM_HASH = "2393cf17a0c2a8ba35c796697190efb279f66f4360b85b5265d2182cc0b8a47198e3c1db62ba2dc32a3bd4addbc9efff33469fb71a057e8afaad7ca0d926aa13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(readarray.sty) \
texlive-readarray"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(forloop.sty) \
tex(ifthen.sty) \
tex(listofitems.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
