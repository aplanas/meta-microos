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

PV = "2023.209.1.6svn64470"

RPM_NAME = "texlive-pagegrid-2023.209.1.6svn64470-52.1.noarch.rpm"
RPM_HASH = "0242fa5d6f344eb1ae7a51af549569e5909a11e94f1931e72dcd4d5997c3c95dfccaa7c3304fc941fe43e6b4da9953b3a9bb8dbbb5684791f6f131f7ae040c24"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pagegrid.sty \
texlive-pagegrid"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-atbegshi.sty \
tex-kvoptions.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
