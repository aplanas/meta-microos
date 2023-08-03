SUMMARY = "Documentation for texlive-tokenizer"
DESCRIPTION = "This package includes the documentation for texlive-tokenizer"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1.0svn15878"

RPM_NAME = "texlive-tokenizer-doc-2023.209.1.1.0svn15878-53.1.noarch.rpm"
RPM_HASH = "d88bbcb9e70d8f0b65da1c3eb96c45cd62439a47e4301e357611e2b98672befb788c1f87bf365a34dfb8453b85226ba937b72559eea73797759518eda2fb232b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tokenizer-doc"

RDEPENDS:${PN} += ""

inherit rpm
