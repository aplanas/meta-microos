SUMMARY = "Binary files of texlive-scripts"
DESCRIPTION = "Binary files of texlive-scripts"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn64356"

RPM_NAME = "texlive-scripts-bin-2023.20230311.svn64356-91.1.aarch64.rpm"
RPM_HASH = "1690ef0842ace6baa5289eda5b070bac5da29093339781b4604ac9d756d832bb28a7b7232bb404bdb2d0a676612f87c5877acdf3ce363532ddfe31a47a03f29c"

RPROVIDES:${PN} += "texlive-scripts-bin"

RDEPENDS:${PN} += "texlive-scripts"

inherit rpm
