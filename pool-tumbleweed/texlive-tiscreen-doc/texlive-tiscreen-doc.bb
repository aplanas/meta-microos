SUMMARY = "Documentation for texlive-tiscreen"
DESCRIPTION = "This package includes the documentation for texlive-tiscreen"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn62602"

RPM_NAME = "texlive-tiscreen-doc-2023.201.svn62602-52.1.noarch.rpm"
RPM_HASH = "f8da2c520aa20c116df59790e930b28bd1862290659779f5bf62b2d6d0bd21d84858797812b46644ffde7f7b6abd60221951049824a81d4a9b1c60f3f531bde2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tiscreen-doc"
RDEPENDS:${PN} += ""

inherit rpm
