SUMMARY = "Documentation for texlive-commado"
DESCRIPTION = "This package includes the documentation for texlive-commado"
LICENSE = "LPPL-1.0"

PV = "2023.201.r0.11asvn38875"

RPM_NAME = "texlive-commado-doc-2023.201.r0.11asvn38875-53.1.noarch.rpm"
RPM_HASH = "3fae996b4dd7b3ead828e785959302fa41d53aa0b761e0d769a0f61bed8a79f949f3b31224c332b776baa2f5cf4f422c99750e6498b8edb951e9f8cf17abf84b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-commado-doc"

RDEPENDS:${PN} += ""

inherit rpm
