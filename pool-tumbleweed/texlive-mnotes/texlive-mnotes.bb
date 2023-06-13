SUMMARY = "Margin annotation for collaborative writing"
DESCRIPTION = "The package provides a flexible mechanism for annotating, and \
commenting upon, collaboratively-written documents."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.9svn63406"

RPM_NAME = "texlive-mnotes-2023.201.0.0.9svn63406-54.1.noarch.rpm"
RPM_HASH = "95296d1a0144562738e78cce93e8b43bcb8d8f716b9d140081c18648eea0b6031d9b5c1d1c74113a6e5da8b0097809f7e01122267ccafd8a84b65854079c91e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(mnotes.sty) \
texlive-mnotes"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(color.sty) \
tex(ifoddpage.sty) \
tex(kvoptions.sty) \
tex(marginnote.sty) \
tex(sidenotes.sty) \
tex(soul.sty) \
tex(tikz.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
