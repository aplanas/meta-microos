SUMMARY = "Documentation for texlive-rvwrite"
DESCRIPTION = "This package includes the documentation for texlive-rvwrite"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn19614"

RPM_NAME = "texlive-rvwrite-doc-2023.209.1.2svn19614-54.1.noarch.rpm"
RPM_HASH = "9fe99ebfc4e37b4585951c3369caf3cd3e39a24a6a32544cf2e0d6938c2f14213de342f9c0e2d13d550fe756187c25f81973df793a9cc2d750e2267c57b3b722"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rvwrite-doc"

RDEPENDS:${PN} += ""

inherit rpm
