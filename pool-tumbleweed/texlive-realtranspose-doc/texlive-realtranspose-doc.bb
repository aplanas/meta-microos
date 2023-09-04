SUMMARY = "Documentation for texlive-realtranspose"
DESCRIPTION = "This package includes the documentation for texlive-realtranspose"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn56623"

RPM_NAME = "texlive-realtranspose-doc-2023.209.1.1svn56623-54.2.noarch.rpm"
RPM_HASH = "922d0562e845456a1418fa5a74c82d5909cd69eb76e91db4724dff9b18b7e88ac49e34c90f45c2c5955a5aac29c8309b710f1c8d76cd97a3c9cb9d6217acce00"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-realtranspose-doc"

RDEPENDS:${PN} += ""

inherit rpm
