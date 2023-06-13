SUMMARY = "Documentation for texlive-textpos"
DESCRIPTION = "This package includes the documentation for texlive-textpos"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.10.1svn63967"

RPM_NAME = "texlive-textpos-doc-2023.201.1.10.1svn63967-54.1.noarch.rpm"
RPM_HASH = "d4c4600963fb5fd85b8d457c192e58868e495c8ff5caa56e22deadc8fc95a5367add13dde55b4203fd8edc8fe14a64c3f6ddb0d42a4ca887e4e475c3afe1e31b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-textpos-doc"

RDEPENDS:${PN} += ""

inherit rpm
