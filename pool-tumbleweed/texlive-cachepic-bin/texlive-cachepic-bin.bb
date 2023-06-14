SUMMARY = "Binary files of cachepic"
DESCRIPTION = "Binary files of cachepic"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn15543"

RPM_NAME = "texlive-cachepic-bin-2023.20230311.svn15543-91.1.aarch64.rpm"
RPM_HASH = "b377c5c761489c8637a720f14c60df0204c861a4962fedf3b021fef46d609c54f4b59dde0c41425d84a9aed6ce89341908a6c6f4fcdb1d8b10ce1b3a4ba198dc"

RPROVIDES:${PN} += "texlive-cachepic-bin"

RDEPENDS:${PN} += "texlive-cachepic"

inherit rpm
