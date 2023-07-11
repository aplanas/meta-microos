SUMMARY = "Documentation for texlive-ean13isbn"
DESCRIPTION = "This package includes the documentation for texlive-ean13isbn"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn57514"

RPM_NAME = "texlive-ean13isbn-doc-2023.201.svn57514-53.2.noarch.rpm"
RPM_HASH = "72391a87dd9bd4a94d5e1c8b67b2c0f3954269a007d4e5f86902de4e5f2bf388017c9bd2b268235c3bc2d85a241bf246fb5cf1a96c207951fa82997863009ff9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ean13isbn-doc"

RDEPENDS:${PN} += ""

inherit rpm
