SUMMARY = "Documentation for texlive-ltxfileinfo"
DESCRIPTION = "This package includes the documentation for texlive-ltxfileinfo"
LICENSE = "GPL-2.0-or-later"

PV = "2023.208.2.04svn38663"

RPM_NAME = "texlive-ltxfileinfo-doc-2023.208.2.04svn38663-53.1.noarch.rpm"
RPM_HASH = "b4606be5155bc6d2d48afbcc6d35ef1b7ffdb442c69cef93064a8c5c015f9f2bae8cc55460c3c7c8c3b93ebf8ca45308aaafddcac1bf3055ac629bea3cad7387"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ltxfileinfo-doc"

RDEPENDS:${PN} += ""

inherit rpm
