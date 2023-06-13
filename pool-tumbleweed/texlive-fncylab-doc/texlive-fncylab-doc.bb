SUMMARY = "Documentation for texlive-fncylab"
DESCRIPTION = "This package includes the documentation for texlive-fncylab"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn52090"

RPM_NAME = "texlive-fncylab-doc-2023.201.1.1svn52090-52.1.noarch.rpm"
RPM_HASH = "c57e01de4bb19fc4d27d7740f8cd5dbc31f2863540b8b596fc5eb3172d51d27ee0f65ea9c4056abd9899cecbba6c6a4468d46e097d528b44ce8ee211340fd114"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fncylab-doc"

RDEPENDS:${PN} += ""

inherit rpm
