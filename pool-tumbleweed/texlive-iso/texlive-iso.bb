SUMMARY = "Generic ISO standards typesetting macros"
DESCRIPTION = "Generic class and package files for typesetting ISO \
International Standard documents. Several standard documents \
have been printed by ISO from camera-ready copy prepared using \
LaTeX and these files. The class makes use of the isorot \
package, rather than use other mechanisms directly."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.4svn15878"

RPM_NAME = "texlive-iso-2023.209.2.4svn15878-56.1.noarch.rpm"
RPM_HASH = "4034b69a2af99cc7557b4ce694a088544066b555274e80cd6b1ecce1b3634b8efcaa50e4f341fcc04cb4a4dc5dc8d260f7c6b727945139f4b032f118ad2c2d0f"
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
