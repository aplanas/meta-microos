SUMMARY = "Documentation for texlive-cmupint"
DESCRIPTION = "This package includes the documentation for texlive-cmupint"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn54735"

RPM_NAME = "texlive-cmupint-doc-2023.201.1.1svn54735-53.1.noarch.rpm"
RPM_HASH = "d2e146ff6d51e5cde96b6929c957a49053874a438e6a00746ed4b21c7fcc4ebe33c9d921a32d80b5aae76bda8dd0408e771ba3d9e2f09c7547c7ad5579681c09"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cmupint-doc"

RDEPENDS:${PN} += ""

inherit rpm
