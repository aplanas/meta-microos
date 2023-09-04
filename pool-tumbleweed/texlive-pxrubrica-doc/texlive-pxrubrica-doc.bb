SUMMARY = "Documentation for texlive-pxrubrica"
DESCRIPTION = "This package includes the documentation for texlive-pxrubrica"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3esvn66298"

RPM_NAME = "texlive-pxrubrica-doc-2023.209.1.3esvn66298-54.2.noarch.rpm"
RPM_HASH = "9f1df88abb7f1773fbbcb9726490800ed195b562517b969841b4a30bb3f067930b6d9933bbfc526cf6870e94adc79e409607148985fb21c714a7b4be715bbcb5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-pxrubrica-doc-ja \
texlive-pxrubrica-doc"

RDEPENDS:${PN} += ""

inherit rpm
