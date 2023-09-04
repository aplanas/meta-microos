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

PV = "2023.209.1.2bsvn15878"

RPM_NAME = "texlive-hanging-2023.209.1.2bsvn15878-54.2.noarch.rpm"
RPM_HASH = "fea65816eb129c6f6c2b554dcda99f5c9a26fd28ca1407e4a5f7a9859c2e6c9d14cee95958d0f3153cdf0d418a457a55dfd6caeaa293b38963492f37fd57807f"
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
