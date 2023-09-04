SUMMARY = "Binary files of texdiff"
DESCRIPTION = "Binary files of texdiff"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn15506"

RPM_NAME = "texlive-texdiff-bin-2023.20230311.svn15506-93.2.aarch64.rpm"
RPM_HASH = "bdc1f5d40b3989f8bb32a5ef8cac5e0e14935867a4dce5f6e47d43b01e9bcaaa9f288c284b29a14a4246f425d6501f710f499445f2266cd2047dbb5abc82fdb2"

RPROVIDES:${PN} += "texlive-texdiff-bin"

RDEPENDS:${PN} += "texlive-texdiff"

inherit rpm
