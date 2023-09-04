SUMMARY = "Documentation for texlive-ec"
DESCRIPTION = "This package includes the documentation for texlive-ec"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn25033"

RPM_NAME = "texlive-ec-doc-2023.209.1.0svn25033-54.2.noarch.rpm"
RPM_HASH = "62266e6cebd8686371fbcf3251590aa9c289efacff9f48d781c5290315ef0c4a1b76714403c64bbf68bc10ae95056a49ae2097b9bb44db47f360cdb40b100247"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ec-doc"

RDEPENDS:${PN} += ""

inherit rpm
