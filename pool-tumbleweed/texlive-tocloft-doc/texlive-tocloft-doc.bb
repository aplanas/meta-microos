SUMMARY = "Documentation for texlive-tocloft"
DESCRIPTION = "This package includes the documentation for texlive-tocloft"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.3jsvn53364"

RPM_NAME = "texlive-tocloft-doc-2023.209.2.3jsvn53364-53.1.noarch.rpm"
RPM_HASH = "b0246b92680a4a6b718312f48a9526ebd9ccd44aaf4cd2f2b1739b8658de07dd9bb75be4ecab3d5f40adeea3339dd8a998b748f4a1f654f854a7e925caab264d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tocloft-doc"

RDEPENDS:${PN} += ""

inherit rpm
