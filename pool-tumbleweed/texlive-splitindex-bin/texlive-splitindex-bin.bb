SUMMARY = "Binary files of splitindex"
DESCRIPTION = "Binary files of splitindex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn29688"

RPM_NAME = "texlive-splitindex-bin-2023.20230311.svn29688-92.1.aarch64.rpm"
RPM_HASH = "7ef6974b7ade8c92d87199671512887f75f53d65eacbe54e47d73e9bf52c43e7844d78ab155145ea3f6ffb143907e4b19645e31e107e6aa7584af049caf16d47"

RPROVIDES:${PN} += "texlive-splitindex-bin"

RDEPENDS:${PN} += "texlive-splitindex"

inherit rpm
