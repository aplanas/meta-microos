SUMMARY = "Documentation for texlive-glossaries-spanish"
DESCRIPTION = "This package includes the documentation for texlive-glossaries-spanish"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn35665"

RPM_NAME = "texlive-glossaries-spanish-doc-2023.209.1.0svn35665-54.1.noarch.rpm"
RPM_HASH = "68c1704a1fe2119c098aa6ebe0c7e37784be2d644253b7e5db6a57ce776538cc9cd0f39c7fbc40352bb8e950446e92d6844eaf800f16aac2f9a39e3623f362db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-glossaries-spanish-doc"

RDEPENDS:${PN} += ""

inherit rpm
