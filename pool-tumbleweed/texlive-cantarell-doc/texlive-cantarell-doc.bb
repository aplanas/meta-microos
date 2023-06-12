SUMMARY = "Documentation for texlive-cantarell"
DESCRIPTION = "This package includes the documentation for texlive-cantarell"
LICENSE = "OFL-1.1"

PV = "2023.201.3.2svn54512"

RPM_NAME = "texlive-cantarell-doc-2023.201.3.2svn54512-52.1.noarch.rpm"
RPM_HASH = "263ff7d5195e69ba6acd14c39172a4a5947f569d83a0db525bc3487394c904102da7f444e3cd86bae418a4e91aca1db2c96f995dcee15dab1361b8aa105d0e6a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cantarell-doc"
RDEPENDS:${PN} += ""

inherit rpm
