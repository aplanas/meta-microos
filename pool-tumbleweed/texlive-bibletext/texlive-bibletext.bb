SUMMARY = "Insert Bible passages by their reference"
DESCRIPTION = "The package allows to insert Bible texts in a document by \
specifying references."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1.2svn45196"

RPM_NAME = "texlive-bibletext-2023.209.0.0.1.2svn45196-54.1.noarch.rpm"
RPM_HASH = "3b21dd7c017f66ecb3bee0694736ef7b53d1a299e821a2fa51e8f5a74c966a2b33a90ec18f47e50373e41c773f490b4d9fe43075f4a43144fc3601ffb2b86908"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bibletext.sty \
texlive-bibletext"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pdftexcmds.sty \
tex-pgfkeys.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
