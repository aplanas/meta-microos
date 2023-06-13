SUMMARY = "Documentation for texlive-stubs"
DESCRIPTION = "This package includes the documentation for texlive-stubs"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.1.1svn66204"

RPM_NAME = "texlive-stubs-doc-2023.201.0.0.1.1svn66204-57.1.noarch.rpm"
RPM_HASH = "93a25fadb59dca78480117e85d82e5ac63e351f30d36a323bc4e4650ea26e88e75eef26105f666cfe9901ab94cd67b934997b177123cdb73669b6858c79fc470"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-stubs-doc"

RDEPENDS:${PN} += ""

inherit rpm
