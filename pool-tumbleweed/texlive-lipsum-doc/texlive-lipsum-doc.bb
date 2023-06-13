SUMMARY = "Documentation for texlive-lipsum"
DESCRIPTION = "This package includes the documentation for texlive-lipsum"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.7svn60561"

RPM_NAME = "texlive-lipsum-doc-2023.201.2.7svn60561-54.1.noarch.rpm"
RPM_HASH = "f2d59da480e4584b6a4063ecde2adb49ce79901bc74f9c9dc6777de0ea74f92cd5872f5a2fbdb4300b0ea96a4b341a34495ee978c17cfdc70a2f6b1fee54c4e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lipsum-doc"

RDEPENDS:${PN} += ""

inherit rpm
