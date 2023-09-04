SUMMARY = "Documentation for texlive-yhmath"
DESCRIPTION = "This package includes the documentation for texlive-yhmath"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.6svn54377"

RPM_NAME = "texlive-yhmath-doc-2023.209.1.6svn54377-53.2.noarch.rpm"
RPM_HASH = "b3036d721d130f9776e643722df3317b47b55d58b7ae9f6935e7601ea853b69e69aa8df8c5e8033992d546b94a4cf11ff0bcfc965e55ae65e91593c1a53846cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-yhmath-doc"

RDEPENDS:${PN} += ""

inherit rpm
