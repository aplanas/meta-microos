SUMMARY = "Binary files of urlbst"
DESCRIPTION = "Binary files of urlbst"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn23262"

RPM_NAME = "texlive-urlbst-bin-2023.20230311.svn23262-93.1.aarch64.rpm"
RPM_HASH = "76d48ab43eba774857e5710f3fb2f15fd4e4f09622dd1ffea7d84fd606ed086cdb67ae5c7578d98857b2ef69fc8cd61fc25c2d108f7558002255923abea4e4c0"

RPROVIDES:${PN} += "texlive-urlbst-bin"

RDEPENDS:${PN} += "texlive-urlbst"

inherit rpm
