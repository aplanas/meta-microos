SUMMARY = "Documentation for texlive-ocherokee"
DESCRIPTION = "This package includes the documentation for texlive-ocherokee"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn25689"

RPM_NAME = "texlive-ocherokee-doc-2023.201.svn25689-54.1.noarch.rpm"
RPM_HASH = "6a4e0bfb518c02d3c0f5454318dd92307bcaf82327011935035118d933f790e27bc90b3c865181a5f471ce06462bd483dc6281c917343e53509cf3d0d91b2fd1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ocherokee-doc"
RDEPENDS:${PN} += ""

inherit rpm
