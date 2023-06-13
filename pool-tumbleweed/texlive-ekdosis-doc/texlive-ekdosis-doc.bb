SUMMARY = "Documentation for texlive-ekdosis"
DESCRIPTION = "This package includes the documentation for texlive-ekdosis"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.4svn61113"

RPM_NAME = "texlive-ekdosis-doc-2023.201.1.4svn61113-53.1.noarch.rpm"
RPM_HASH = "600c6c68a639fb25c53837e105256518d118fec26201470bbdf92556b5f13101bc73db52e6fbb3d9fb1f4dc6f5b9b7a61998c757ca5c815091f2bd490ab1880c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ekdosis-doc"

RDEPENDS:${PN} += ""

inherit rpm
