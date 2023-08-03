SUMMARY = "A XeLaTeX package for theses and dissertations at Iranian Universities"
DESCRIPTION = "A package for preparing dissertations and theses for Iranian \
universities as fast and as efficiently as possible. The \
package depends on xparse, fancyhdr, graphicx, multirow, float, \
and adjustbox."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3svn54840"

RPM_NAME = "texlive-parsa-2023.209.1.3svn54840-52.1.noarch.rpm"
RPM_HASH = "c483ca68cd2b1d688b9e9eb2faf802807fa3f56db35ec7f23afa37e2c03b4bc0096b836e2e9adf04210665181e1214c85988788b1e6147adb5e7723662ff413b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-parsa.sty \
texlive-parsa"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-adjustbox.sty \
tex-fancyhdr.sty \
tex-float.sty \
tex-graphicx.sty \
tex-multirow.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
