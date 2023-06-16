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

RPM_NAME = "texlive-hanging-2023.201.1.2bsvn15878-53.1.noarch.rpm"
RPM_HASH = "d3b4c4fa9145d2bd04eba51ad254b5c8a8f597d4a1a143732765a482c2e825fe8832a4579276edeb3f72959cf4e6f4ebdf65af15963e600149a03bc9cb0644a1"
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
