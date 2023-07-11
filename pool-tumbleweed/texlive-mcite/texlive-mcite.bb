SUMMARY = "Multiple items in a single citation"
DESCRIPTION = "The mcite package allows the user to collapse multiple \
citations into one, as is customary in physics journals. The \
package requires a customised BibTeX style for its work; the \
documentation explains how to do that customisation."
LICENSE = "GPL-2.0-or-later"

PV = "2023.208.1.6svn18173"

RPM_NAME = "texlive-mcite-2023.208.1.6svn18173-53.1.noarch.rpm"
RPM_HASH = "ac5278e18652a7e71707ae7c801569a764569567afb34738dca732dc96b94a26433c35ca66a5b27a11d4d99cd1e7b21a96cb6fd4986f8cb992242ac383998420"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mcite.sty \
texlive-mcite"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
