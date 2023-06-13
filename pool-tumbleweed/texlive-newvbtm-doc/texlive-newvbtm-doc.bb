SUMMARY = "Documentation for texlive-newvbtm"
DESCRIPTION = "This package includes the documentation for texlive-newvbtm"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn23996"

RPM_NAME = "texlive-newvbtm-doc-2023.201.1.1svn23996-54.1.noarch.rpm"
RPM_HASH = "9273d87e10a5d7bfeb4a0188249189577e7168d2f8e8f067d6766896ed9f13edacb8f4d5892d88ee5a1ff88699d9207f5ef09da1f4b4a7e62fd8a1da5ceaa205"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-newvbtm-doc"

RDEPENDS:${PN} += ""

inherit rpm
