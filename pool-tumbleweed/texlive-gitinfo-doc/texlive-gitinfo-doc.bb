SUMMARY = "Documentation for texlive-gitinfo"
DESCRIPTION = "This package includes the documentation for texlive-gitinfo"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn34049"

RPM_NAME = "texlive-gitinfo-doc-2023.209.1.0svn34049-54.2.noarch.rpm"
RPM_HASH = "324fe675adbceb7bb48d5b9dc2c531640899cc28cb44e8f63c104472ec7c64653d8138240ffc6491ef4ca69a389c222cce89d72a0272fb73ae39d91e1243e5fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gitinfo-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
