SUMMARY = "Binary files of checkcites"
DESCRIPTION = "Binary files of checkcites"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn25623"

RPM_NAME = "texlive-checkcites-bin-2023.20230311.svn25623-91.1.aarch64.rpm"
RPM_HASH = "8d57a3a4a6ae405910d394c2e1d7a8b5234e9626035f06ea7b63084e9eaad225314893801b5345c1e00d1d721b341cf7a20799245bc7528c98cf9d7607628c6f"

RPROVIDES:${PN} += "texlive-checkcites-bin \
texlive-checkcites-bin(aarch-64)"

RDEPENDS:${PN} += "texlive-checkcites"

inherit rpm
