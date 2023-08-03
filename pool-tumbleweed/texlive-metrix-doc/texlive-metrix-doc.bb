SUMMARY = "Documentation for texlive-metrix"
DESCRIPTION = "This package includes the documentation for texlive-metrix"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.5svn52323"

RPM_NAME = "texlive-metrix-doc-2023.209.1.5svn52323-55.1.noarch.rpm"
RPM_HASH = "2649cd3e8b0a4bfbbdbfdec9a7060bd6c97e8e556c7f2f5958505bd7d28d6abc8a09eb37486545a26c1ba8edfe10eae1b221139fad3f7c2c179680fc8f7d647e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-metrix-doc"

RDEPENDS:${PN} += ""

inherit rpm
