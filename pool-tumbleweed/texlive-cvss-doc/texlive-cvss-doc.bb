SUMMARY = "Documentation for texlive-cvss"
DESCRIPTION = "This package includes the documentation for texlive-cvss"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1.0svn65169"

RPM_NAME = "texlive-cvss-doc-2023.209.1.1.0svn65169-55.1.noarch.rpm"
RPM_HASH = "7c8e7cf64536e3a9ded10c9830bf83b5a4f308a9cbc79041b9f961ce6e183674673f4ada9122934a5596d22b641c243f7249c5912108270b908e472087ebe348"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cvss-doc"

RDEPENDS:${PN} += ""

inherit rpm
