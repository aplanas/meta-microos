SUMMARY = "Generic ISO standards typesetting macros"
DESCRIPTION = "Generic class and package files for typesetting ISO \
International Standard documents. Several standard documents \
have been printed by ISO from camera-ready copy prepared using \
LaTeX and these files. The class makes use of the isorot \
package, rather than use other mechanisms directly."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.4svn15878"

RPM_NAME = "texlive-iso-2023.201.2.4svn15878-55.1.noarch.rpm"
RPM_HASH = "81674e7219b57dd296408f1c82a8099c4a2bd375944a8eb5f00e64ef9dc9330426461937eaea2006577d6d0eac4106e061cddca737aef5953b4a2e8d239c0d6b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-askincv1.sty \
tex-iso10.clo \
tex-iso11.clo \
tex-iso9.clo \
tex-isov2.cls \
texlive-iso"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-url.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
