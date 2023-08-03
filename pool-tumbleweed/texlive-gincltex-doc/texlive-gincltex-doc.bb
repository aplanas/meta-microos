SUMMARY = "Documentation for texlive-gincltex"
DESCRIPTION = "This package includes the documentation for texlive-gincltex"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3svn64967"

RPM_NAME = "texlive-gincltex-doc-2023.209.0.0.3svn64967-53.1.noarch.rpm"
RPM_HASH = "23f6e2ff77944038803ca9e7b4d1d8bba1336f8fd30ba1431d44a4506a64a911fbad9b6c8e44205f8465e3276c339e58c4cfb744fc82d4d0883b3bd078350228"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gincltex-doc"

RDEPENDS:${PN} += ""

inherit rpm
