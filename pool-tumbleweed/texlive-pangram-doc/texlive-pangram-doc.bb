SUMMARY = "Documentation for texlive-pangram"
DESCRIPTION = "This package includes the documentation for texlive-pangram"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.0csvn66300"

RPM_NAME = "texlive-pangram-doc-2023.209.0.0.0csvn66300-52.1.noarch.rpm"
RPM_HASH = "4dd6d4803faf2e873b0a8d21245cdfcaebc398b5bb318bc625024aa5e638b9abb51ca39a72e4d5ff1b040749be1c881c43d5768933da55cd801c876e631a3983"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pangram-doc"

RDEPENDS:${PN} += ""

inherit rpm
