SUMMARY = "Binary files of mltex"
DESCRIPTION = "Binary files of mltex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn3006"

RPM_NAME = "texlive-mltex-bin-2023.20230311.svn3006-93.2.aarch64.rpm"
RPM_HASH = "2bed2babe3632d0cb83418ab6ee6227794736bae544ff299df2f47e78a86391c2fc3156612e555d822f75a0e6ac0230f3697f770cff424a7291d3c9668f342e8"

RPROVIDES:${PN} += "texlive-mltex-bin"

RDEPENDS:${PN} += "texlive-mltex"

inherit rpm
