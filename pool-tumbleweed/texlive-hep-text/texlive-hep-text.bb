SUMMARY = "List and text extensions"
DESCRIPTION = "The hep-text package extends LaTeX lists using the enumitem \
package and provides some text macros. The package is loaded \
with \\usepackage{hep-text}."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn64906"

RPM_NAME = "texlive-hep-text-2023.201.1.1svn64906-53.1.noarch.rpm"
RPM_HASH = "432f986d6e0b4fdd61c0452c40ba12420f9a137510f2a44737848fa769005e18aeed8ddc0ff45ee48a1f0870c9004d48b11fb23b8b4d9152f33f72edfe7963ad"
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
