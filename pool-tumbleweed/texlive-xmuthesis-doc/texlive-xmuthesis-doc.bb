SUMMARY = "Documentation for texlive-xmuthesis"
DESCRIPTION = "This package includes the documentation for texlive-xmuthesis"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.4.1svn56614"

RPM_NAME = "texlive-xmuthesis-doc-2023.209.0.0.4.1svn56614-53.1.noarch.rpm"
RPM_HASH = "cfa86564fc23ffc6b7b0ffd8f994d1469ded9da53408fab9648ace4cfdfc70d1b51d286772aeffc09c95ee348fb6a3026910c03eb7ff5842cede6843b3b6ad03"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xmuthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
