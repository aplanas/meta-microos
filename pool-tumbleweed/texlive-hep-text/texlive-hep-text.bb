SUMMARY = "List and text extensions"
DESCRIPTION = "The hep-text package extends LaTeX lists using the enumitem \
package and provides some text macros. The package is loaded \
with \\usepackage{hep-text}."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn64906"

RPM_NAME = "texlive-hep-text-2023.209.1.1svn64906-54.2.noarch.rpm"
RPM_HASH = "7c924176e86392e5fc3f915c067acb489723cd748062c088e65cf043bc00d45ad6c4f75616834b724cc09325f2ac23241286d759f517bed67183d81fecdb9d14"
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
