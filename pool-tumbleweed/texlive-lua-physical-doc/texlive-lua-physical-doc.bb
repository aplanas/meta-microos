SUMMARY = "Documentation for texlive-lua-physical"
DESCRIPTION = "This package includes the documentation for texlive-lua-physical"
LICENSE = "LPPL-1.0"

PV = "2023.208.1.0.5svn59138"

RPM_NAME = "texlive-lua-physical-doc-2023.208.1.0.5svn59138-53.1.noarch.rpm"
RPM_HASH = "540cc2273475bca108510a988ed3be6cb3c76c607307bbc4b1c3955bae3cc9b3be8885aa3adfaba1f2f5413f84ac1e22dbd90b3bdbf1b506314220849cb56804"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lua-physical-doc"

RDEPENDS:${PN} += ""

inherit rpm
