SUMMARY = "Documentation for texlive-hmtrump"
DESCRIPTION = "This package includes the documentation for texlive-hmtrump"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2asvn54512"

RPM_NAME = "texlive-hmtrump-doc-2023.201.1.2asvn54512-53.2.noarch.rpm"
RPM_HASH = "280ed3a9fd9ac45cf1b436a7224047611f73d1a16795b00750bedc556da55342fb0b0a71275575a4b9ac3adeb731c8117882fafb66fb894666ee69f9c4481661"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-hmtrump-doc-ja \
texlive-hmtrump-doc"

RDEPENDS:${PN} += ""

inherit rpm
