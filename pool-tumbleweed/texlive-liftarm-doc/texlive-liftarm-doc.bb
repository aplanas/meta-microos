SUMMARY = "Documentation for texlive-liftarm"
DESCRIPTION = "This package includes the documentation for texlive-liftarm"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0svn62981"

RPM_NAME = "texlive-liftarm-doc-2023.209.2.0svn62981-55.1.noarch.rpm"
RPM_HASH = "ebe396797ab2f685154042b5eec720c3fc71232996b61c365c9334f794d87d9fee99ebef59672a6b8c752f4657f95a771b6caffdf3275d02eb452f2bd5feb10d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-liftarm-doc"

RDEPENDS:${PN} += ""

inherit rpm
