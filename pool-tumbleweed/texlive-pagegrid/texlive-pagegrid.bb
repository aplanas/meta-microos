SUMMARY = "Print page grid in background"
DESCRIPTION = "This package puts a grid on the paper. It was written for \
developers of a class or package who have to put elements on \
definite locations on a page (e.g. letter class). The grid \
allows a faster optical check, whether the positions are \
correct. If the previewer already offers features for \
measuring, the package might be unnecessary. Otherwise it saves \
the developer from printing the page and measuring by hand. The \
package was part of the oberdiek bundle."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.6svn64470"

RPM_NAME = "texlive-pagegrid-2023.201.1.6svn64470-51.1.noarch.rpm"
RPM_HASH = "45ec54af02c67959c7f2f53b5e6a68c7f8d4b50520a7dfe6b2df6161be3f410433adca38bfdc34c9e72c4867ea102490f13f6b566f9c4ddd609dd3965995c53a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pagegrid.sty) \
texlive-pagegrid"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(atbegshi.sty) \
tex(kvoptions.sty) \
tex(tikz.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
