SUMMARY = "Objects and proxies in LaTeX3"
DESCRIPTION = "This package introduces a new mechanism to create objects like \
the well known C structures. The functions exported by this \
package are quite low level, and many important mechanisms like \
member protection and name resolution aren't already defined \
and should be introduced by intermediate packages."
LICENSE = "GPL-2.0-or-later"

PV = "2023.208.2.2svn65230"

RPM_NAME = "texlive-lt3rawobjects-2023.208.2.2svn65230-53.1.noarch.rpm"
RPM_HASH = "b13ecae21f30dd953d2d8c9f23afa4598731c41bf1e41b3675c9cb36538ff9f900da3279e89e3abc923731c5842223d1000021070c891bce734557c5d48a78c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lt3rawobjects.sty \
texlive-lt3rawobjects"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
