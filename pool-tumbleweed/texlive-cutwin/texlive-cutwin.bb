SUMMARY = "Cut a window in a paragraph, typeset material in it"
DESCRIPTION = "The package provides facilities to cut windows out of \
paragraphs, and to typeset text or other material in the \
window. The window may be rectangular, or may have other sorts \
of shape."
LICENSE = "LPPL-1.0"

PV = "2023.204.0.0.2svn60901"

RPM_NAME = "texlive-cutwin-2023.204.0.0.2svn60901-54.1.noarch.rpm"
RPM_HASH = "e13dce037d27a7a53ea02df1cc36b80e26830b93a8508684c3b8cb44fe0b148ebbfb81bbf2843bc7af0577678ab37fd661a0b3a08473f36fd9b90ef1c334c66e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cutwin.sty \
texlive-cutwin"

RDEPENDS:${PN} += "/bin/sh \
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
