SUMMARY = "Binary files of chklref"
DESCRIPTION = "Binary files of chklref"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn52631"

RPM_NAME = "texlive-chklref-bin-2023.20230311.svn52631-93.1.aarch64.rpm"
RPM_HASH = "6461257b54a1b986d53366f08574f2b943c6da68315a330d242dc96a9e80e9a39196b26e1ddd9b72cd9f563fcc452df0ae1fcbb76e13c46b1ac014a93ad83ea1"

RPROVIDES:${PN} += "texlive-chklref-bin"

RDEPENDS:${PN} += "texlive-chklref"

inherit rpm
