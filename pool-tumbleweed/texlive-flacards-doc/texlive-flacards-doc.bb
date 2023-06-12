SUMMARY = "Documentation for texlive-flacards"
DESCRIPTION = "This package includes the documentation for texlive-flacards"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.1.1bsvn19440"

RPM_NAME = "texlive-flacards-doc-2023.201.0.0.1.1bsvn19440-52.1.noarch.rpm"
RPM_HASH = "0a5dd011d2bc5c8ac44e2bb39e9630b9b85f4b74d39deaf0ce86c0b53d15b7043b63f3449ed1646a520e7380d3fd1385f35bac3e7ad8bb61db4e00a8dd320787"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-flacards-doc"
RDEPENDS:${PN} += ""

inherit rpm
