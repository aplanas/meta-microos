SUMMARY = "Documentation for texlive-pstring"
DESCRIPTION = "This package includes the documentation for texlive-pstring"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn42857"

RPM_NAME = "texlive-pstring-doc-2023.201.svn42857-53.2.noarch.rpm"
RPM_HASH = "4077d131fcedcc01c6969f3dab28fc24b496a90768727e0b8d8e9bd89008c4aaacc78e986a1271a683934e9c3add4c8d657cbab10d82d9eb733f715d06f736e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pstring-doc"

RDEPENDS:${PN} += ""

inherit rpm
