SUMMARY = "Documentation for texlive-unicodefonttable"
DESCRIPTION = "This package includes the documentation for texlive-unicodefonttable"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0gsvn65009"

RPM_NAME = "texlive-unicodefonttable-doc-2023.209.1.0gsvn65009-54.1.noarch.rpm"
RPM_HASH = "db1ec5b1b3a8df35c835d42c46f7e9b11add9e638465d7a01dc4be5cf0cf2c9f4f6d2e6f63c8fbbaae1c59311c5b633a5f61c0db6954a106d933c27c47cb4b40"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-unicodefonttable-doc"

RDEPENDS:${PN} += ""

inherit rpm
