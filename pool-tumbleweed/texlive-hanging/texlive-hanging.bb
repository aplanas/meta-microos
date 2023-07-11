SUMMARY = "Hanging paragraphs"
DESCRIPTION = "The hanging package facilitates the typesetting of hanging \
paragraphs. The package also enables typesetting with hanging \
punctuation, by making punctuation characters active. This \
facility is best suppressed (it can interfere with other \
packages) -- there are package options for suppressing each \
individual punctuation character. 'Real' attempts at hanging \
punction should nowadays use the microtype package, which takes \
advantage of the support offered in recent versions of pdfTeX."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2bsvn15878"

RPM_NAME = "texlive-hanging-2023.201.1.2bsvn15878-53.2.noarch.rpm"
RPM_HASH = "d730d71b89a95726c0ae8a056ca92c4abf7b5e3f16c12c438f2e28b48507f79ed3b5532355ea21d3bc44877dd5fa834ccc9e6ea7fd27630552d5fb7f395e60bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hanging.sty \
texlive-hanging"

RDEPENDS:${PN} += "/usr/bin/sh \
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
