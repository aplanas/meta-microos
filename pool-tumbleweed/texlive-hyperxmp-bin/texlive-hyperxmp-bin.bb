SUMMARY = "Binary files of hyperxmp"
DESCRIPTION = "Binary files of hyperxmp"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn56984"

RPM_NAME = "texlive-hyperxmp-bin-2023.20230311.svn56984-91.1.aarch64.rpm"
RPM_HASH = "1b5f84ccf35b3e2c6b4d749ba38c472877e0acde6190caa1d71e7b351761398d0b4d0ea2cabd8c13d0efbc32fa24f3eae22662346bbfc17844c0aa8e9c262ae2"

RPROVIDES:${PN} += "texlive-hyperxmp-bin \
texlive-hyperxmp-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-hyperxmp"

inherit rpm
