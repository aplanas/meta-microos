SUMMARY = "Documentation for texlive-berenisadf"
DESCRIPTION = "This package includes the documentation for texlive-berenisadf"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.004svn32215"

RPM_NAME = "texlive-berenisadf-doc-2023.201.1.004svn32215-53.1.noarch.rpm"
RPM_HASH = "188911261fb82cb1de42f0c8dec7480a1a5d5540dbccb4dc8cc1ccb65f14cef0c59190c576efc3f6871f1c6d13eba208df9823247028cdcd1b7788b00624d485"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-berenisadf-doc"

RDEPENDS:${PN} += "/usr/bin/fontforge"

inherit rpm
