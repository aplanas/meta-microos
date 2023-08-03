SUMMARY = "Documentation for texlive-asmejour"
DESCRIPTION = "This package includes the documentation for texlive-asmejour"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.20svn65405"

RPM_NAME = "texlive-asmejour-doc-2023.209.1.20svn65405-54.1.noarch.rpm"
RPM_HASH = "5492e90de697787c3d455db4c209a572f0ccf336d48eb379eb0a7d1ed3ba2ba5c595dedf57dc8425e7a3dee517bb01af3dc16b2093de6ba83cafed6dae6f6ebd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-asmejour-doc"

RDEPENDS:${PN} += ""

inherit rpm
