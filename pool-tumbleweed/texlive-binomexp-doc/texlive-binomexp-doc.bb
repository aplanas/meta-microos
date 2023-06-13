SUMMARY = "Documentation for texlive-binomexp"
DESCRIPTION = "This package includes the documentation for texlive-binomexp"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn15878"

RPM_NAME = "texlive-binomexp-doc-2023.201.1.0svn15878-53.1.noarch.rpm"
RPM_HASH = "c13fcf50f8110ca96bffe4f1e4435756ca713c1f6648c747728cf6741948b0318b678f24b956d915f0664599a7720600f02519341b5eb9306a60d6eb87b4eae8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-binomexp-doc"

RDEPENDS:${PN} += ""

inherit rpm
