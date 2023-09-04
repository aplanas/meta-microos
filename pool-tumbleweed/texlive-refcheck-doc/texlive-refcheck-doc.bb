SUMMARY = "Documentation for texlive-refcheck"
DESCRIPTION = "This package includes the documentation for texlive-refcheck"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.9.1svn29128"

RPM_NAME = "texlive-refcheck-doc-2023.209.1.9.1svn29128-54.2.noarch.rpm"
RPM_HASH = "3c767817c83f89ba20439dbb3ca08b59f422ef252781915f91fb67d11be54b8828fe7d75e8a6da0637b1c359a1eb1a3bc31afccb4d6eec43a8d0c6d34fbf2a94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-refcheck-doc"

RDEPENDS:${PN} += ""

inherit rpm
