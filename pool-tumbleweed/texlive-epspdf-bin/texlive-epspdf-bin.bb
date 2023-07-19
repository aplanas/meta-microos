SUMMARY = "Binary files of epspdf"
DESCRIPTION = "Binary files of epspdf"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn29050"

RPM_NAME = "texlive-epspdf-bin-2023.20230311.svn29050-93.1.aarch64.rpm"
RPM_HASH = "cf560ab636964734d903292be8613aac397863f2f18aee8f59766a3ae80f058f24be018a7e305e50d090fcd363d54b287343092eff194eb9717cd609e113a75e"

RPROVIDES:${PN} += "texlive-epspdf-bin"

RDEPENDS:${PN} += "texlive-epspdf"

inherit rpm
