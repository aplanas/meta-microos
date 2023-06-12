SUMMARY = "Documentation for texlive-ushort"
DESCRIPTION = "This package includes the documentation for texlive-ushort"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.2svn32261"

RPM_NAME = "texlive-ushort-doc-2023.201.2.2svn32261-53.1.noarch.rpm"
RPM_HASH = "744d82d0c0bb907f24f95e48dea065c062e546d049ea30327aad967c824ba9d8eb99ca0ec1bb693ebd8f170bbdad845fcb43c4aaf69e3eab5b8e8442cd7c0487"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ushort-doc"
RDEPENDS:${PN} += ""

inherit rpm
