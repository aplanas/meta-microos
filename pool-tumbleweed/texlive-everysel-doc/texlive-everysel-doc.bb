SUMMARY = "Documentation for texlive-everysel"
DESCRIPTION = "This package includes the documentation for texlive-everysel"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.1svn57489"

RPM_NAME = "texlive-everysel-doc-2023.209.2.1svn57489-53.1.noarch.rpm"
RPM_HASH = "07a8b2d53ce59ca8a4d169b5ddc053f9b9ca7385c17fcd4ba7c0b29158762a2fe1058d4a699e067305a294409bf59dd8aa3a57b1651e5ea2c51909a5acc350ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-everysel-doc"

RDEPENDS:${PN} += ""

inherit rpm
