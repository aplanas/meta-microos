SUMMARY = "Binary files of crossrefware"
DESCRIPTION = "Binary files of crossrefware"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn45927"

RPM_NAME = "texlive-crossrefware-bin-2023.20230311.svn45927-93.2.aarch64.rpm"
RPM_HASH = "e50ca174330e932ef4bf913438415810881c8912edac58af053259d5b932b306fb5163fd3d7024a0ea226f920f7d11fc1f004808e69d6757ff6b98f5f8b42f9b"

RPROVIDES:${PN} += "texlive-crossrefware-bin"

RDEPENDS:${PN} += "texlive-crossrefware"

inherit rpm
