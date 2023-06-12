SUMMARY = "Documentation for texlive-initials"
DESCRIPTION = "This package includes the documentation for texlive-initials"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn54080"

RPM_NAME = "texlive-initials-doc-2023.201.svn54080-52.1.noarch.rpm"
RPM_HASH = "432d7c574e1d490c8e1659eaeea206b159b2b2c9d8c4a87ad56f7b9331b6579a56f8b96efc241fd9bebc7df4cc78da3e8fc7d156c44f19c6d5f42c520dc10c65"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-initials-doc"
RDEPENDS:${PN} += ""

inherit rpm
