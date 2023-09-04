SUMMARY = "Binary files of ketcindy"
DESCRIPTION = "Binary files of ketcindy"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn49033"

RPM_NAME = "texlive-ketcindy-bin-2023.20230311.svn49033-93.2.aarch64.rpm"
RPM_HASH = "41470ae9acbcf28ef58a86fbc695e8202ff5bfdabe87ab8a06e40d516d27adfed34f28dcb63c7b43ee5c4e22f4ccfc6a7d0a85b85d655f21626469f4ef239782"

RPROVIDES:${PN} += "texlive-ketcindy-bin"

RDEPENDS:${PN} += "texlive-ketcindy"

inherit rpm
