SUMMARY = "Documentation for texlive-graphics-pln"
DESCRIPTION = "This package includes the documentation for texlive-graphics-pln"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn65187"

RPM_NAME = "texlive-graphics-pln-doc-2023.201.svn65187-53.2.noarch.rpm"
RPM_HASH = "79d5bee2ad722eb6b526a738655569f63cccd3a9e5fab69f792d5f8f6adb15a084186397c6e2ce06fffac3c4250d616ed63a78dff06912da8f4ba8b9e4661d54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-graphics-pln-doc"

RDEPENDS:${PN} += ""

inherit rpm
