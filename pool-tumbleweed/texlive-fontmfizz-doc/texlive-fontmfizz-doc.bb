SUMMARY = "Documentation for texlive-fontmfizz"
DESCRIPTION = "This package includes the documentation for texlive-fontmfizz"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn43546"

RPM_NAME = "texlive-fontmfizz-doc-2023.201.svn43546-52.1.noarch.rpm"
RPM_HASH = "c5a2ef8bce8be438ea8ebb6a3dd73866101a369cc96444bb6eb179820f0ea5781b833194fe36c32f899d08c97b0b418a3aeee3c93531fb5b3e774e906b5c4b7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fontmfizz-doc"
RDEPENDS:${PN} += ""

inherit rpm
