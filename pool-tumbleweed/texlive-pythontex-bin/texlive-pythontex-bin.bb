SUMMARY = "Binary files of pythontex"
DESCRIPTION = "Binary files of pythontex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn31638"

RPM_NAME = "texlive-pythontex-bin-2023.20230311.svn31638-93.2.aarch64.rpm"
RPM_HASH = "d27f387eada00bb3e5e0b1eb31c9f6d4b85f52af0d98d6b2c0cae478787d1e810279b9e9ab9b68d7000d1d72c3d0394e276a88ee497d0711aaa251f2b62fb078"

RPROVIDES:${PN} += "texlive-pythontex-bin"

RDEPENDS:${PN} += "texlive-pythontex"

inherit rpm
