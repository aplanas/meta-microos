SUMMARY = "Documentation for texlive-ltxfileinfo"
DESCRIPTION = "This package includes the documentation for texlive-ltxfileinfo"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.2.04svn38663"

RPM_NAME = "texlive-ltxfileinfo-doc-2023.201.2.04svn38663-52.1.noarch.rpm"
RPM_HASH = "f94ab79522173b794762dcafbca3f285eafbee6376a8d991c3e0dd67b8e27e3c8421a2ab0a18f5778c373485ed94436b45bf32d7c8ba449e85c8110f084042a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ltxfileinfo-doc"

RDEPENDS:${PN} += ""

inherit rpm
