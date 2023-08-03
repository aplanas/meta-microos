SUMMARY = "Documentation for texlive-kpfonts-otf"
DESCRIPTION = "This package includes the documentation for texlive-kpfonts-otf"
LICENSE = "OFL-1.1"

PV = "2023.209.0.0.48svn65560"

RPM_NAME = "texlive-kpfonts-otf-doc-2023.209.0.0.48svn65560-56.1.noarch.rpm"
RPM_HASH = "c3500423eea35492d5060576cf919fc1d374190e76be8f9e5a93b8bb9abb8e441d3907b0ad7368827af35789f188b2de906855ff9ef0517effc175eb088a8ea1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-kpfonts-otf-doc-en;fr \
texlive-kpfonts-otf-doc"

RDEPENDS:${PN} += ""

inherit rpm
