SUMMARY = "Package to display recorder fingering diagrams"
DESCRIPTION = "This package provides support for generating and displaying \
fingering diagrams for baroque fingering recorders. Standard \
fingerings are provided for recorders in both C and F, along \
with methods to create and display alternate fingerings for \
trills, etc."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1bsvn66008"

RPM_NAME = "texlive-recorder-fingering-2023.209.1.1bsvn66008-54.2.noarch.rpm"
RPM_HASH = "488a58b8ba38c97dfc2f8b70c14a9dfdb0496b74e0a883af7e8efa86ecb4985f8dfb2f87d0a5da3132e905eb20c7691b73d9327d24091865e0077c20e5c90088"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-recorder-fingering.sty \
texlive-recorder-fingering"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphicx.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
