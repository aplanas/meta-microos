SUMMARY = "Binary files of epspdf"
DESCRIPTION = "Binary files of epspdf"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn29050"

RPM_NAME = "texlive-epspdf-bin-2023.20230311.svn29050-93.2.aarch64.rpm"
RPM_HASH = "f3effe481e6f858f65e7a1a0fc72429bbdbfc6f28f675eb0e75b61465a2f980f2ea352895d866d36570e02319a33b683b8e600d2d33623130009d34ba2ebbbf6"

RPROVIDES:${PN} += "texlive-epspdf-bin"

RDEPENDS:${PN} += "texlive-epspdf"

inherit rpm
