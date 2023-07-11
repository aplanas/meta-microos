SUMMARY = "Binary files of optex"
DESCRIPTION = "Binary files of optex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn53804"

RPM_NAME = "texlive-optex-bin-2023.20230311.svn53804-92.1.aarch64.rpm"
RPM_HASH = "8549f6d3317f51f304d6d13183219391bdd024e4df614e0e7500b3f2b063d3d99f05c09d82cf95e7168f0582503bc66bbdfcb1b85084480117dcae8debb8dfeb"

RPROVIDES:${PN} += "texlive-optex-bin"

RDEPENDS:${PN} += "texlive-optex"

inherit rpm
