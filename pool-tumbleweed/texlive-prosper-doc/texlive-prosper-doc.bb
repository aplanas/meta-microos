SUMMARY = "Documentation for texlive-prosper"
DESCRIPTION = "This package includes the documentation for texlive-prosper"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0hsvn33033"

RPM_NAME = "texlive-prosper-doc-2023.201.1.0hsvn33033-52.1.noarch.rpm"
RPM_HASH = "be98268037d6dde49a089dd2ccceb19e58565efce2c401321c7afb8c01f5d5611cc79f4a1b4e24f4492e7fd32da98198852d85bc381926de1338492450e38b3f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-prosper-doc"
RDEPENDS:${PN} += ""

inherit rpm
