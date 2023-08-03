SUMMARY = "Documentation for texlive-minim-hatching"
DESCRIPTION = "This package includes the documentation for texlive-minim-hatching"
LICENSE = "LPPL-1.0"

PV = "2023.209.2022_1.1svn62395"

RPM_NAME = "texlive-minim-hatching-doc-2023.209.2022_1.1svn62395-55.1.noarch.rpm"
RPM_HASH = "c967eadcc55436a94d9d26cbbe1a4e03dc3432c50a310eacce48b5dd18ff20e39eb7cb72f06b75b2341fb099aa446ac6d854686648acc798b71ece882e5991db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-minim-hatching-doc"

RDEPENDS:${PN} += ""

inherit rpm
