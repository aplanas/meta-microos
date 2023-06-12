SUMMARY = "Documentation for texlive-truncate"
DESCRIPTION = "This package includes the documentation for texlive-truncate"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.3.6svn18921"

RPM_NAME = "texlive-truncate-doc-2023.201.3.6svn18921-52.1.noarch.rpm"
RPM_HASH = "d0da05e432a063468119c2e89d0a1250c46fc2468ec39bd52acd5474f34e977d23d6a38cc30a25ce657552198e91eb2aac549c20112bbd07e25741a039604a47"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-truncate-doc"
RDEPENDS:${PN} += ""

inherit rpm
