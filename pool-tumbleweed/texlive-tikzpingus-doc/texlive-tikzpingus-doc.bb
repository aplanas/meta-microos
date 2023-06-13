SUMMARY = "Documentation for texlive-tikzpingus"
DESCRIPTION = "This package includes the documentation for texlive-tikzpingus"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.0svn64199"

RPM_NAME = "texlive-tikzpingus-doc-2023.201.1.0svn64199-52.1.noarch.rpm"
RPM_HASH = "cf7fbacab8c1c5eed36e0bdd02bca42cc8d59650dd4eb351d1601ce3eb35ef783bdbacb9613c8c7fa8186472b1d5b9357fd5f9a4020eae7ee115175f01f49000"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikzpingus-doc"

RDEPENDS:${PN} += ""

inherit rpm
