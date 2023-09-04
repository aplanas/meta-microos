SUMMARY = "Binary files of cyrillic-bin"
DESCRIPTION = "Binary files of cyrillic-bin"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn53554"

RPM_NAME = "texlive-cyrillic-bin-bin-2023.20230311.svn53554-93.2.aarch64.rpm"
RPM_HASH = "e7764a2f241b0b5192ab382a63006db362e6e8ac825e57f102f0c171bcd084e94cb24b03a4f451752db33c9e15fee0762d2d82d991f1bc16eca18c2807f78947"

RPROVIDES:${PN} += "texlive-cyrillic-bin-bin"

RDEPENDS:${PN} += "texlive-cyrillic-bin"

inherit rpm
