SUMMARY = "Typeset notes, in the margin"
DESCRIPTION = "The package provides a macro \\sidenote, that places a note in \
the margin of the document, with its baseline aligned with the \
baseline in the body of the document. These sidenotes are \
numbered (both in the text, and on the notes themselves). The \
package loads the package etoolbox, pgfopts and marginnote."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.7svn61992"

RPM_NAME = "texlive-snotez-2023.209.0.0.7svn61992-58.1.noarch.rpm"
RPM_HASH = "a68882862c483c6e8f0158c74e20a0c127cbfeaa77467f958b3eb5251fbeb3b2d8102777289df122620023da85bd1586b3c7439ba8ae3d11b426955e5add728d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-snotez.sty \
texlive-snotez"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-marginnote.sty \
tex-pgfopts.sty \
tex-zref-perpage.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
