SUMMARY = "Documentation for texlive-kalendarium"
DESCRIPTION = "This package includes the documentation for texlive-kalendarium"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn48744"

RPM_NAME = "texlive-kalendarium-doc-2023.201.1.0svn48744-55.1.noarch.rpm"
RPM_HASH = "214fc4c0ae846bb92b28bc77a0f5ada3678179f457bc579bef82be818fde99ac2f0f0fef7a76f52109be2c98893c179a7d28a389f99b2d6734433f4d9db8538d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-kalendarium-doc"

RDEPENDS:${PN} += ""

inherit rpm
