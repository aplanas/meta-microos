SUMMARY = "Documentation for texlive-typewriter"
DESCRIPTION = "This package includes the documentation for texlive-typewriter"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn46641"

RPM_NAME = "texlive-typewriter-doc-2023.201.1.1svn46641-52.1.noarch.rpm"
RPM_HASH = "f7be479901aa0f36c89ac23eacda2398c586ba4f2f84adb00bda32206357fabca718ae921c6ee8edbe0934af51e4d13c222070a2698802d061550f5c2b7e13f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-typewriter-doc"

RDEPENDS:${PN} += ""

inherit rpm
