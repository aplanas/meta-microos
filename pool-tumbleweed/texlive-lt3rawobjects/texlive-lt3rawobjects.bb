SUMMARY = "Objects and proxies in LaTeX3"
DESCRIPTION = "This package introduces a new mechanism to create objects like \
the well known C structures. The functions exported by this \
package are quite low level, and many important mechanisms like \
member protection and name resolution aren't already defined \
and should be introduced by intermediate packages."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.2.2svn65230"

RPM_NAME = "texlive-lt3rawobjects-2023.201.2.2svn65230-52.1.noarch.rpm"
RPM_HASH = "a908af5a4e820d1d1ec6741c193161dc39a9babf111a9ba4e11b7ffd87580e3a440a5d61e49e50a1904a04ee836e8d35a3c330e2fcd37680a3d59de4d7b83846"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(lt3rawobjects.sty) \
texlive-lt3rawobjects"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(expl3.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
