SUMMARY = "Documentation for texlive-lobster2"
DESCRIPTION = "This package includes the documentation for texlive-lobster2"
LICENSE = "OFL-1.1"

PV = "2023.201.svn64442"

RPM_NAME = "texlive-lobster2-doc-2023.201.svn64442-54.1.noarch.rpm"
RPM_HASH = "a08db1a1e884109edb72bc78a1dd9a27b9608bda3b9172ac39cc21dec1c4df16ca74b93ae70cae47258e3668d73dd2b26facba6881e3fa585363d3ef54801bcc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lobster2-doc"

RDEPENDS:${PN} += ""

inherit rpm
