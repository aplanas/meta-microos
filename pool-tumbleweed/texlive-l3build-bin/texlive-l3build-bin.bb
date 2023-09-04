SUMMARY = "Binary files of l3build"
DESCRIPTION = "Binary files of l3build"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn46894"

RPM_NAME = "texlive-l3build-bin-2023.20230311.svn46894-93.2.aarch64.rpm"
RPM_HASH = "ef63e50331b955f89787d1cea86e7951ecfc27f7c5405e2c3de4b51c3b925feebdbeaafd362196b7bc3de83a0d61aee7af0b40516702850d85b2610611c42dd3"

RPROVIDES:${PN} += "texlive-l3build-bin"

RDEPENDS:${PN} += "texlive-l3build"

inherit rpm
