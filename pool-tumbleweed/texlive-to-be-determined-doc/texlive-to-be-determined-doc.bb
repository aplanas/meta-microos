SUMMARY = "Documentation for texlive-to-be-determined"
DESCRIPTION = "This package includes the documentation for texlive-to-be-determined"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3.0svn64882"

RPM_NAME = "texlive-to-be-determined-doc-2023.201.0.0.3.0svn64882-52.1.noarch.rpm"
RPM_HASH = "dd49fc1ebb5d5ae5566617cfa867c0331a963020ea7ca80f463aa771c44603c3c6115ea16fb37ada7fd624fbb3090dd80d8420c464561c3cf23da50dd1762eea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-to-be-determined-doc"

RDEPENDS:${PN} += ""

inherit rpm
