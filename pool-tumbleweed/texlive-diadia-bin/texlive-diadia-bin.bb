SUMMARY = "Binary files of diadia"
DESCRIPTION = "Binary files of diadia"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn37645"

RPM_NAME = "texlive-diadia-bin-2023.20230311.svn37645-93.1.noarch.rpm"
RPM_HASH = "f1b0e4b1cba0ed390379836f774b178d9aa6879e1c477e4f196037b2176d25761fd05340e1206a8e19fbca1f7b2569137ee3bb77ff24f75d77c581a16b3925f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-diadia-bin"

RDEPENDS:${PN} += "texlive-diadia"

inherit rpm
