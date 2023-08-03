SUMMARY = "Documentation for texlive-datetime2-basque"
DESCRIPTION = "This package includes the documentation for texlive-datetime2-basque"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2asvn47064"

RPM_NAME = "texlive-datetime2-basque-doc-2023.209.1.2asvn47064-53.1.noarch.rpm"
RPM_HASH = "46fdb071b74711f6a34670a59a5959f726953b44038ef7d0a5efafc88a379c715ed1759958c518667165f8302dd946203069c1827fc077f89de8afd6aa9d39ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-basque-doc"

RDEPENDS:${PN} += ""

inherit rpm
