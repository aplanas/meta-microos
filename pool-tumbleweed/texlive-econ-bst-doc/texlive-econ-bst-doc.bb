SUMMARY = "Documentation for texlive-econ-bst"
DESCRIPTION = "This package includes the documentation for texlive-econ-bst"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.1.1svn61499"

RPM_NAME = "texlive-econ-bst-doc-2023.201.3.1.1svn61499-53.2.noarch.rpm"
RPM_HASH = "de55e56e2029c4dca9db8ac1fa3b85fb2865d8283901a8745b96cdbae8b9ee1ebcb84ac59f6a686474888fdad57fec7b122cae13dc505e5e67a83a91c037ad3c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-econ-bst-doc"

RDEPENDS:${PN} += ""

inherit rpm
