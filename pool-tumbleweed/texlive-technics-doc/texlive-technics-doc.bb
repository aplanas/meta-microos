SUMMARY = "Documentation for texlive-technics"
DESCRIPTION = "This package includes the documentation for texlive-technics"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn29349"

RPM_NAME = "texlive-technics-doc-2023.209.1.0svn29349-55.1.noarch.rpm"
RPM_HASH = "70724e0430102f23472648abc6c7dc7efdea6b773f7aeaebc3ea50fcae4ca941e25ba831032392b3122d4bfccb51a2238f687675a6a28eec415282a0ebf7329b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-technics-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
