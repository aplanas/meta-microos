SUMMARY = "Binary files of pax"
DESCRIPTION = "Binary files of pax"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn10843"

RPM_NAME = "texlive-pax-bin-2023.20230311.svn10843-92.1.aarch64.rpm"
RPM_HASH = "299f51f2f97b77e8d3e0ba371bab81de237443bd63d6f2135aae522a219130567d7cc9dbc162c80fa31e715a7f505ae3ff19291115061020c0759ac8254835bf"

RPROVIDES:${PN} += "texlive-pax-bin"

RDEPENDS:${PN} += "texlive-pax"

inherit rpm
