SUMMARY = "Documentation for texlive-12many"
DESCRIPTION = "This package includes the documentation for texlive-12many"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3svn15878"

RPM_NAME = "texlive-12many-doc-2023.201.0.0.3svn15878-54.1.noarch.rpm"
RPM_HASH = "993d4d180c243bf7bc08171bdf5396ec7ebb82dd2782d84143a531d2cef8163a87191d22c339d07651a6f2acd94777b250d6f95b07b062a4a2df976d8b8cff1a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-12many-doc"

RDEPENDS:${PN} += ""

inherit rpm
