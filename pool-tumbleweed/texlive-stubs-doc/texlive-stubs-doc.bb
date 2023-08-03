SUMMARY = "Documentation for texlive-stubs"
DESCRIPTION = "This package includes the documentation for texlive-stubs"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.1.1svn66204"

RPM_NAME = "texlive-stubs-doc-2023.209.0.0.1.1svn66204-58.1.noarch.rpm"
RPM_HASH = "dc27849396c138b69e2cb1d8b374facfe47f11e048bc9c97f8f65366858a05769f596c52e7fb563ac282de11a3139d0fae143e975bce570b983515d154ea1c30"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-stubs-doc"

RDEPENDS:${PN} += ""

inherit rpm
