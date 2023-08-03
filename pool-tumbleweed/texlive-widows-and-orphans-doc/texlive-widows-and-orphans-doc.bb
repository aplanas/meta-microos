SUMMARY = "Documentation for texlive-widows-and-orphans"
DESCRIPTION = "This package includes the documentation for texlive-widows-and-orphans"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0esvn66532"

RPM_NAME = "texlive-widows-and-orphans-doc-2023.209.1.0esvn66532-54.1.noarch.rpm"
RPM_HASH = "06f55ae34914f67e89d9a0969672f9b30de5c7785ae43f4790609f3aafca4f2b45fec2253fd40089397d9b2cd205d0b35cf4a7809059969ecab253f4caef965d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-widows-and-orphans-doc"

RDEPENDS:${PN} += ""

inherit rpm
