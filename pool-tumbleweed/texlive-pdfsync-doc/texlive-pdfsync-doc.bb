SUMMARY = "Documentation for texlive-pdfsync"
DESCRIPTION = "This package includes the documentation for texlive-pdfsync"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn20373"

RPM_NAME = "texlive-pdfsync-doc-2023.201.svn20373-51.1.noarch.rpm"
RPM_HASH = "b14d983abd754b208dc1128c1eb02b743d1c043c4aee931292ff050ee909591a99b2b89c06edd41c17e0e01075b1ce2abcbaede9a74f7ab8622c82f429fc27b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pdfsync-doc"
RDEPENDS:${PN} += ""

inherit rpm
