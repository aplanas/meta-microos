SUMMARY = "Documentation for texlive-pxjodel"
DESCRIPTION = "This package includes the documentation for texlive-pxjodel"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3svn64072"

RPM_NAME = "texlive-pxjodel-doc-2023.201.0.0.3svn64072-53.1.noarch.rpm"
RPM_HASH = "5a0e2a7494a3f1825cd5a2586eec49e9e60972b07e41bb029998757f1a44d5a8610f37923b8699986727766cfd35fddfa98a8eaed9ac7acf897412535f3c94c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pxjodel-doc"

RDEPENDS:${PN} += ""

inherit rpm
