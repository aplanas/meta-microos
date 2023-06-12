SUMMARY = "Documentation for texlive-colorprofiles"
DESCRIPTION = "This package includes the documentation for texlive-colorprofiles"
LICENSE = "LPPL-1.0"

PV = "2023.201.20181105svn49086"

RPM_NAME = "texlive-colorprofiles-doc-2023.201.20181105svn49086-53.1.noarch.rpm"
RPM_HASH = "d55c1d5f0ef697e4956a02247db56ed250065c3434f0dffb4fc8286c0d7606fb49be62cc9f5499e596b16ece4556d08e27738fd6b8bac8dd833b35f83d021392"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-colorprofiles-doc"
RDEPENDS:${PN} += ""

inherit rpm
