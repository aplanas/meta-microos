SUMMARY = "Binary files of make4ht"
DESCRIPTION = "Binary files of make4ht"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn37750"

RPM_NAME = "texlive-make4ht-bin-2023.20230311.svn37750-92.1.aarch64.rpm"
RPM_HASH = "c34605d8c024d35b443fcbce9bdfc16e1510b3ae1f3c161a5e544fb05189050ffe19ca031217e019f2679aa71e5a7b08bdf424f17ea0ac2de106dcbeee3b46f0"

RPROVIDES:${PN} += "texlive-make4ht-bin"

RDEPENDS:${PN} += "texlive-make4ht"

inherit rpm
