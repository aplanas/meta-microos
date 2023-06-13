SUMMARY = "Documentation for texlive-showhyphenation"
DESCRIPTION = "This package includes the documentation for texlive-showhyphenation"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1asvn63578"

RPM_NAME = "texlive-showhyphenation-doc-2023.201.0.0.1asvn63578-53.1.noarch.rpm"
RPM_HASH = "dbd947aab6581ca4f4dc729a648287bd9d9332e2f2f47ca445d615c4c551becf1d9bab54798c1f970d3bce7b31c4aaac9df577d48551345f63fabf0589767beb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-showhyphenation-doc"

RDEPENDS:${PN} += ""

inherit rpm
