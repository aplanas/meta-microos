SUMMARY = "Documentation for texlive-datetime2-slovak"
DESCRIPTION = "This package includes the documentation for texlive-datetime2-slovak"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn52281"

RPM_NAME = "texlive-datetime2-slovak-doc-2023.201.1.1svn52281-52.1.noarch.rpm"
RPM_HASH = "7ea34f843e36b2b8f2619e5ac7262b6c68d570a9bd76f8dcd791a7c421416dd04f538fad8d1ebd8eb3a5556ce9c3bec5f8c8208996d982b815dc7848b76b851e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-slovak-doc"
RDEPENDS:${PN} += ""

inherit rpm
