SUMMARY = "List and text extensions"
DESCRIPTION = "The hep-text package extends LaTeX lists using the enumitem \
package and provides some text macros. The package is loaded \
with \\usepackage{hep-text}."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn64906"

RPM_NAME = "texlive-hep-text-2023.201.1.1svn64906-53.2.noarch.rpm"
RPM_HASH = "f5af6e1d45874f3ce903cce7cfe9a5adf9b242c55602a49d7ab158efb17ae293e14fa6627a4350079e7b3b8c6fce9b3b6751b2ef327a57e0b8f72177ee9cb693"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hep-text.sty \
texlive-hep-text"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-babel.sty \
tex-csquotes.sty \
tex-enumitem.sty \
tex-foreign.sty \
tex-kvoptions.sty \
tex-pdftexcmds.sty \
tex-relsize.sty \
tex-soulutf8.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
