SUMMARY = "Documentation for texlive-datetime2-basque"
DESCRIPTION = "This package includes the documentation for texlive-datetime2-basque"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2asvn47064"

RPM_NAME = "texlive-datetime2-basque-doc-2023.201.1.2asvn47064-52.1.noarch.rpm"
RPM_HASH = "1f5b525682ee3fd14d091d0327c982d8eb4f5477f279fefca73140e326eae606148666c6c1ab73393c52636bd968dcd1a44e3ffcded9de89097bcf00aa081c04"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-basque-doc"
RDEPENDS:${PN} += ""

inherit rpm
