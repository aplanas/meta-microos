SUMMARY = "Documentation for texlive-section"
DESCRIPTION = "This package includes the documentation for texlive-section"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn20180"

RPM_NAME = "texlive-section-doc-2023.209.svn20180-54.1.noarch.rpm"
RPM_HASH = "ca8e56d9d56cc12699b0659b01e2a38ad8d4153a067da0f6f06625035c9bd69f57021616ae25929a2b034d629ca948ab324de4dd2611d974757ab1eef1a22a36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-section-doc"

RDEPENDS:${PN} += ""

inherit rpm
