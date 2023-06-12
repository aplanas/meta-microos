SUMMARY = "Documentation for texlive-docutils"
DESCRIPTION = "This package includes the documentation for texlive-docutils"
LICENSE = "BSD-3-Clause"

PV = "2023.201.svn56594"

RPM_NAME = "texlive-docutils-doc-2023.201.svn56594-52.1.noarch.rpm"
RPM_HASH = "950cad6c2eb2d311388e60ccfbdf1ede608d62f7c348d7b6383d2aa2dcdbd19c419d8eeda9ccb2608e8c425865bd7947fd517db29f064a2fd494e8ff534410f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-docutils-doc"
RDEPENDS:${PN} += ""

inherit rpm
