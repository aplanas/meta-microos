SUMMARY = "Documentation for texlive-imakeidx"
DESCRIPTION = "This package includes the documentation for texlive-imakeidx"
LICENSE = "LPPL-1.0"

PV = "2023.208.1.3esvn42287"

RPM_NAME = "texlive-imakeidx-doc-2023.208.1.3esvn42287-53.1.noarch.rpm"
RPM_HASH = "22b81a8672fc954648bf358cd273b91522715f7d4ae41ddf68fe1a16f8837932ce727719d5c62779e69c997dbad866503f4d6499267c2cd803c4d30021e93cd2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-imakeidx-doc"

RDEPENDS:${PN} += ""

inherit rpm
