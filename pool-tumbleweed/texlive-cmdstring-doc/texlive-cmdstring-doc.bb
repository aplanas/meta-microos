SUMMARY = "Documentation for texlive-cmdstring"
DESCRIPTION = "This package includes the documentation for texlive-cmdstring"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn15878"

RPM_NAME = "texlive-cmdstring-doc-2023.201.1.1svn15878-53.1.noarch.rpm"
RPM_HASH = "32b5c8fccf8399fa891b346c4c669d6a964c0ec9f0b1f43a6a4087d2d12bd0bad8ac11d5b75a0e2bf9d49732b8fdef7d08ee0ef35f35495125447445f84ef66c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cmdstring-doc"

RDEPENDS:${PN} += ""

inherit rpm
