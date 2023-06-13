SUMMARY = "Documentation for texlive-poltawski"
DESCRIPTION = "This package includes the documentation for texlive-poltawski"
LICENSE = "LPPL-1.3c"

PV = "2023.201.1.101svn20075"

RPM_NAME = "texlive-poltawski-doc-2023.201.1.101svn20075-52.1.noarch.rpm"
RPM_HASH = "e15c21efdc9bc4687cb6a74bfcb244544b5acee71b514df8f339b9359459e3c7ee904ec1badb23a6a7674859c25c4f7573fe32b8d472554e52dc296decb910bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-poltawski-doc"

RDEPENDS:${PN} += ""

inherit rpm
