SUMMARY = "Binary files of optexcount"
DESCRIPTION = "Binary files of optexcount"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn59817"

RPM_NAME = "texlive-optexcount-bin-2023.20230311.svn59817-93.1.aarch64.rpm"
RPM_HASH = "630c1f8bb61dc3d0cdb129affbeef6358702e6ffbe62dd0031525f000b36cd53bf1625d3420035fcbc575282ce2d524f732862e0cd757a22ab0db6799d9d6cf8"

RPROVIDES:${PN} += "texlive-optexcount-bin"

RDEPENDS:${PN} += "texlive-optexcount"

inherit rpm
