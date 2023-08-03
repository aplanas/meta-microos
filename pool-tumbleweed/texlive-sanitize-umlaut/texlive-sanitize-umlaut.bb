SUMMARY = "Sanitize umlauts for MakeIndex and pdfLaTeX"
DESCRIPTION = "This package sanitizes umlauts to be used directly in index \
entries for MakeIndex and friends with pdfLaTeX. This means \
that inside \\index an umlaut can be used as 'U or as U. In both \
cases, the letter is written as 'U into the raw index file for \
correct processing with MakeIndex and pdfLaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2.1svn63770"

RPM_NAME = "texlive-sanitize-umlaut-2023.209.1.2.1svn63770-54.1.noarch.rpm"
RPM_HASH = "126d3f483b78e2257b7280cb59b4e01e7e9f9e3b4cd8dd013224a33b0961ff483976c8f9ccb136f30dcfb1a6b81f8e246289fe0c26fbc1e3b7e980f041b9d6cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-sanitize-umlaut.sty \
texlive-sanitize-umlaut"

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
