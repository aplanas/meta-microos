SUMMARY = "Binary files of checkcites"
DESCRIPTION = "Binary files of checkcites"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn25623"

RPM_NAME = "texlive-checkcites-bin-2023.20230311.svn25623-92.1.aarch64.rpm"
RPM_HASH = "fca8d3907c21845b3f861c5039e144d4992d56b9be768418317ef7dba9019fb696f2cddd56b0e03afa9ade27f6e803271fa037f87df17e29a29b6e2a89821bec"

RPROVIDES:${PN} += "texlive-checkcites-bin"

RDEPENDS:${PN} += "texlive-checkcites"

inherit rpm
