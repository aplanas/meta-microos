SUMMARY = "Documentation for texlive-fc"
DESCRIPTION = "This package includes the documentation for texlive-fc"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.4svn32796"

RPM_NAME = "texlive-fc-doc-2023.209.1.4svn32796-53.1.noarch.rpm"
RPM_HASH = "62d882ac8e996e7589dd561157f2949c7e989420ae018a6571be1864ddf9ac893322f28bf3a8b2a4bbacb32b9ae4d774698ea19c12f6f65262a72e767d713a66"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fc-doc"

RDEPENDS:${PN} += ""

inherit rpm
