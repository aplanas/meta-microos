SUMMARY = "Documentation for texlive-lua-physical"
DESCRIPTION = "This package includes the documentation for texlive-lua-physical"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.5svn59138"

RPM_NAME = "texlive-lua-physical-doc-2023.201.1.0.5svn59138-52.1.noarch.rpm"
RPM_HASH = "d1622f1f6a32eacf7bee34b58ae11bcc0e2a3454b24fd8c05a8919e5accc90e37aa46288bccba28a267c6e5bc765579201457587098d95fcd7a2e46b303183b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lua-physical-doc"
RDEPENDS:${PN} += ""

inherit rpm
