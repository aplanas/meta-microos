SUMMARY = "Documentation for texlive-semesterplanner"
DESCRIPTION = "This package includes the documentation for texlive-semesterplanner"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn56841"

RPM_NAME = "texlive-semesterplanner-doc-2023.201.1.0svn56841-53.1.noarch.rpm"
RPM_HASH = "1162d86c27c38d813f845683f951fe623b044f180a639c03823d91f2d02e1b4998799cb275326d4a68d4df40c8a62292ed0633e45569ed6506985461deb97df7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-semesterplanner-doc"

RDEPENDS:${PN} += ""

inherit rpm
