SUMMARY = "Binary files of listbib"
DESCRIPTION = "Binary files of listbib"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn26126"

RPM_NAME = "texlive-listbib-bin-2023.20230311.svn26126-93.1.aarch64.rpm"
RPM_HASH = "b9e1b5f4f3a3545415a3d650942efd543e1ef9254044014262981a3a11ca6b4aecd02cc5c99af6968b53487fdb7850bf88bfa1b4542d9236480c8b651bd88bbe"

RPROVIDES:${PN} += "texlive-listbib-bin"

RDEPENDS:${PN} += "texlive-listbib"

inherit rpm
