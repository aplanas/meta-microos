SUMMARY = "Binary files of crossrefware"
DESCRIPTION = "Binary files of crossrefware"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn45927"

RPM_NAME = "texlive-crossrefware-bin-2023.20230311.svn45927-92.1.aarch64.rpm"
RPM_HASH = "c8a8861021196bfd5440c5e719f3e59cf0f262b3cb1ac1f66c38fe105ba75d3a160d3036c8fa879fe7c1eaea183715696dd678ca3d2f9c7c0458097db1fc259c"

RPROVIDES:${PN} += "texlive-crossrefware-bin"

RDEPENDS:${PN} += "texlive-crossrefware"

inherit rpm
