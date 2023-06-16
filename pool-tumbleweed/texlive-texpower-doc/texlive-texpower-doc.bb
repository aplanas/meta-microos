SUMMARY = "Documentation for texlive-texpower"
DESCRIPTION = "This package includes the documentation for texlive-texpower"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.2svn29349"

RPM_NAME = "texlive-texpower-doc-2023.201.0.0.2svn29349-54.1.noarch.rpm"
RPM_HASH = "d545a8a4090374bf8cc1212426d1460dfc5c5b4bf10a9cf676cf6167e90fc9a6925085a30be8b766046b8c766001e39abde097a2a2bc4d8e2aa6d920bdd3827d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-texpower-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
