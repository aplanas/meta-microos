SUMMARY = "List and text extensions"
DESCRIPTION = "The hep-text package extends LaTeX lists using the enumitem \
package and provides some text macros. The package is loaded \
with \\usepackage{hep-text}."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn64906"

RPM_NAME = "texlive-hep-text-2023.209.1.1svn64906-54.1.noarch.rpm"
RPM_HASH = "81a390acb266d513f614a17daa77a03b4e02215af0dbd8aedefa03728effcf6302fb753f044b74b17c30e616efe80f32ee972dde8fb69e5817284d2066d54b18"
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
