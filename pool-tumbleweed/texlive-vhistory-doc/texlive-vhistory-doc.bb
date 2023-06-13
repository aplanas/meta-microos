SUMMARY = "Documentation for texlive-vhistory"
DESCRIPTION = "This package includes the documentation for texlive-vhistory"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.8.0svn61719"

RPM_NAME = "texlive-vhistory-doc-2023.201.1.8.0svn61719-53.1.noarch.rpm"
RPM_HASH = "d5ea9b617de15a5f59a9bf51f98aae123f5e5b0a200bb5d9e6af962d395b8651aa270dfe3e642351cd0581e2abda09ff915b2f08b740e9686abba669eb7c53ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-vhistory-doc:de) \
texlive-vhistory-doc"

RDEPENDS:${PN} += ""

inherit rpm
