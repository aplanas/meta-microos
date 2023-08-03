SUMMARY = "Documentation for texlive-listbib"
DESCRIPTION = "This package includes the documentation for texlive-listbib"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.2.2svn29349"

RPM_NAME = "texlive-listbib-doc-2023.209.2.2svn29349-55.1.noarch.rpm"
RPM_HASH = "a527dc2f5df7af31795739fb65b604cc9f0434b8b8354a74627b27225c15a9d0c66c34594446c5597154cbc165af3bf78c965ec80c173f990435d7d54ac9a8f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-listbib-doc"

RDEPENDS:${PN} += ""

inherit rpm
