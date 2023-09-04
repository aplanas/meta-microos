SUMMARY = "Binary files of convbkmk"
DESCRIPTION = "Binary files of convbkmk"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn30408"

RPM_NAME = "texlive-convbkmk-bin-2023.20230311.svn30408-93.2.aarch64.rpm"
RPM_HASH = "7fd2f02a55141fdbe6ee2fd7675198fe9d63d7ae8750cf98d338b3ea103ecf9ecbe24f01cebe83fea9331f681a6857d05ddf837023c7cd1d44b7fa299b105f6e"

RPROVIDES:${PN} += "texlive-convbkmk-bin"

RDEPENDS:${PN} += "texlive-convbkmk"

inherit rpm
