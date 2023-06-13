SUMMARY = "Documentation for texlive-proposal"
DESCRIPTION = "This package includes the documentation for texlive-proposal"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn40538"

RPM_NAME = "texlive-proposal-doc-2023.201.svn40538-52.1.noarch.rpm"
RPM_HASH = "0bbc2d681463b864a883737b3ae02c226987926268602ebb00eea982b7e20b57a93d292baff8c6f7900cff67b4621042c267e1b96bab4d4eedbae7db9bcb9ed6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-proposal-doc"

RDEPENDS:${PN} += ""

inherit rpm
