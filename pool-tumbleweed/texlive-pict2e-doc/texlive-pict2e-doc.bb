SUMMARY = "Documentation for texlive-pict2e"
DESCRIPTION = "This package includes the documentation for texlive-pict2e"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.4bsvn56504"

RPM_NAME = "texlive-pict2e-doc-2023.201.0.0.4bsvn56504-51.1.noarch.rpm"
RPM_HASH = "77017dbda2d64416dce904aa3a9079f10f90b744f2f072ff871a81de80cd8a52ba010be3463089561a7785ac066cfd8e37ff1ced62d32ccf13985e7897660577"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pict2e-doc"

RDEPENDS:${PN} += ""

inherit rpm
