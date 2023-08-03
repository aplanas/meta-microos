SUMMARY = "Documentation for texlive-hmtrump"
DESCRIPTION = "This package includes the documentation for texlive-hmtrump"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2asvn54512"

RPM_NAME = "texlive-hmtrump-doc-2023.209.1.2asvn54512-54.1.noarch.rpm"
RPM_HASH = "da7539fe804062b9a02b15a416c02cfaeb5b5d7ff301d61b6860f716b7ab3cee15ea6c6729261f193fdfcfe1fa6eaa852c3215c0ea28c60f21930d96d1b1e25f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-hmtrump-doc-ja \
texlive-hmtrump-doc"

RDEPENDS:${PN} += ""

inherit rpm
