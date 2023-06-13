SUMMARY = "Documentation for texlive-hackthefootline"
DESCRIPTION = "This package includes the documentation for texlive-hackthefootline"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn46494"

RPM_NAME = "texlive-hackthefootline-doc-2023.201.svn46494-53.1.noarch.rpm"
RPM_HASH = "e77ee914e8baadb176f18cd175aa1483a8394be966c64dff82b4b5e0a5db8b48b518ebcf4dc1a886a0b4049f3dec613dc6626654e84beb1a57ad542d207c11bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hackthefootline-doc"

RDEPENDS:${PN} += ""

inherit rpm
