SUMMARY = "Binary files of epspdf"
DESCRIPTION = "Binary files of epspdf"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn29050"

RPM_NAME = "texlive-epspdf-bin-2023.20230311.svn29050-92.1.aarch64.rpm"
RPM_HASH = "881e463e7c40d2956c806cde6082a2665f8747475a55c1d4051845942b8f041507b04808201c6c9fcb164180f9464e8c6fcaf45ec91badf9c19507fa1013eb4a"

RPROVIDES:${PN} += "texlive-epspdf-bin"

RDEPENDS:${PN} += "texlive-epspdf"

inherit rpm
