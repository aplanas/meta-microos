SUMMARY = "Documentation for texlive-titlecaps"
DESCRIPTION = "This package includes the documentation for texlive-titlecaps"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3svn63020"

RPM_NAME = "texlive-titlecaps-doc-2023.209.1.3svn63020-53.1.noarch.rpm"
RPM_HASH = "49bf10c98b25c78b8d98259813d3bbda168c7f06da1e78bad028eef577db248791ce9a537995c10121f5806c08cbe71c2cf51b38e5714cb8720e790f76f94baa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-titlecaps-doc"

RDEPENDS:${PN} += ""

inherit rpm
