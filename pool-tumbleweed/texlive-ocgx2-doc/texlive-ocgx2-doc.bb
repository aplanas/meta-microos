SUMMARY = "Documentation for texlive-ocgx2"
DESCRIPTION = "This package includes the documentation for texlive-ocgx2"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.56svn65292"

RPM_NAME = "texlive-ocgx2-doc-2023.201.0.0.56svn65292-54.1.noarch.rpm"
RPM_HASH = "4a6ed50657bbdaedbbf978a31a5d11c5ac384947db6373e4e080f41b7c10d9956b624cb32b1f4c63cb72f2eb739ee8f542330e4850e0bea58d508603d27eabf4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ocgx2-doc"

RDEPENDS:${PN} += ""

inherit rpm
