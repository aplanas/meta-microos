SUMMARY = "Documentation for texlive-pxpgfmark"
DESCRIPTION = "This package includes the documentation for texlive-pxpgfmark"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn30212"

RPM_NAME = "texlive-pxpgfmark-doc-2023.201.0.0.2svn30212-53.1.noarch.rpm"
RPM_HASH = "8b008f7628cb266fbaabf7b4629558a3b1df3f75d4cd86e70c6c07143cd4045525f16bbd4bd6e6cfef5d93d47077458c90c442b5e4f834f024efec573bf56925"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pxpgfmark-doc"

RDEPENDS:${PN} += ""

inherit rpm
