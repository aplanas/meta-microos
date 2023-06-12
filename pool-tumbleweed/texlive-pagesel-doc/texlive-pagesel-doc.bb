SUMMARY = "Documentation for texlive-pagesel"
DESCRIPTION = "This package includes the documentation for texlive-pagesel"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.10svn56105"

RPM_NAME = "texlive-pagesel-doc-2023.201.1.10svn56105-51.1.noarch.rpm"
RPM_HASH = "62fca65496f840456527f054234cba48d4e593e6f7bf916021e01ef84598957442e1927805b85e478fc7e96c2dac21fad58929742a10c4703b71e28a0bf8b781"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-pagesel-doc:en) \
texlive-pagesel-doc"
RDEPENDS:${PN} += ""

inherit rpm
