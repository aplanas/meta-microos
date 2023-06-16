SUMMARY = "Write labels for plants"
DESCRIPTION = "The package defines a command \\plant, which has three mandatory \
and seven optional argument. The package uses the labels"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn29803"

RPM_NAME = "texlive-plantslabels-2023.201.1.0svn29803-51.1.noarch.rpm"
RPM_HASH = "e4f1f196658581cd80ac8009005c0d31d33d2b54195d055b7fee5dfdfcf23edafbd3cb2c8ffe6eb6d7e733de8a862bc8aca9d43a612d7a2694aa1a6c74e9747e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-plantslabels.sty \
texlive-plantslabels"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphicx.sty \
tex-labels.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
