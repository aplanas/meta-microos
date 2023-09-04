SUMMARY = "Binary files of texlogsieve"
DESCRIPTION = "Binary files of texlogsieve"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn61328"

RPM_NAME = "texlive-texlogsieve-bin-2023.20230311.svn61328-93.2.aarch64.rpm"
RPM_HASH = "5c34c8271e6cb00f11e268b7ae0161f96e1d13ed830b7812b7811e7df42143790c2a18ba20437b9c749addc95ba5d4f9ba8900e72bdc6a1525cd0285a936fcb4"

RPROVIDES:${PN} += "texlive-texlogsieve-bin"

RDEPENDS:${PN} += "texlive-texlogsieve"

inherit rpm
