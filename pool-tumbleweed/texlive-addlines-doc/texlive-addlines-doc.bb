SUMMARY = "Documentation for texlive-addlines"
DESCRIPTION = "This package includes the documentation for texlive-addlines"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3svn49326"

RPM_NAME = "texlive-addlines-doc-2023.201.0.0.3svn49326-54.1.noarch.rpm"
RPM_HASH = "6c402e1f656575515c14794a4c6940a208fa839dadaed1c08bed43ce579515cba5c962ed0d7504d99365943aec6be6b1e525fb3d03f3e91b0480267de38da77b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-addlines-doc"

RDEPENDS:${PN} += ""

inherit rpm
