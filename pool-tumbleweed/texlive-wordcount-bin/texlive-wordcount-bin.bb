SUMMARY = "Binary files of wordcount"
DESCRIPTION = "Binary files of wordcount"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn46165"

RPM_NAME = "texlive-wordcount-bin-2023.20230311.svn46165-93.1.aarch64.rpm"
RPM_HASH = "8e07be14f795930b7c4b87e54dc04df60dd577071a1d56b800693b3cb101942ab7745231237f8e1615c13997d582d9975656dc086cddfa5977b9dd961efc9b7c"

RPROVIDES:${PN} += "texlive-wordcount-bin"

RDEPENDS:${PN} += "texlive-wordcount"

inherit rpm
