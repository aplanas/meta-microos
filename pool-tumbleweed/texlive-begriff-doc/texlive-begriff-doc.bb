SUMMARY = "Documentation for texlive-begriff"
DESCRIPTION = "This package includes the documentation for texlive-begriff"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.6svn15878"

RPM_NAME = "texlive-begriff-doc-2023.201.1.6svn15878-53.1.noarch.rpm"
RPM_HASH = "d1dff8aa47b93e75a505b50e6131a66f361641d6c5821505341dbeac4f8c8a74ee088f0ff2205574da3db1dc2dfb5ec8f74988ebefbf3db03950da1a49c663f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-begriff-doc"

RDEPENDS:${PN} += ""

inherit rpm
