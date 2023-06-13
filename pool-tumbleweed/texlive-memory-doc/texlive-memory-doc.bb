SUMMARY = "Documentation for texlive-memory"
DESCRIPTION = "This package includes the documentation for texlive-memory"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn30452"

RPM_NAME = "texlive-memory-doc-2023.201.1.2svn30452-52.1.noarch.rpm"
RPM_HASH = "80fca20c18009abfc02d1f54a1410509761fd8776ba5f28b65eb491e4fe8f1dc42c184789cc0e67494fda402ecaf447e306a4da797ad689d0c1b3d01b6cf7504"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-memory-doc"

RDEPENDS:${PN} += ""

inherit rpm
