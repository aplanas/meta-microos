SUMMARY = "Binary files of sty2dtx"
DESCRIPTION = "Binary files of sty2dtx"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn21215"

RPM_NAME = "texlive-sty2dtx-bin-2023.20230311.svn21215-92.1.aarch64.rpm"
RPM_HASH = "dc3b3771ca2d7e69e653bf0781c15657a4151bfcef7d35c71fabcd228bec13aa20719c48916829ac7fb10a32a4a5aab8bf2b2c248879a155194916906b6d9d04"

RPROVIDES:${PN} += "texlive-sty2dtx-bin"

RDEPENDS:${PN} += "texlive-sty2dtx"

inherit rpm
