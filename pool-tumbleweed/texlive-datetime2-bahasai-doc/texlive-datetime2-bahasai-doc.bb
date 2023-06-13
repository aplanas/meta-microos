SUMMARY = "Documentation for texlive-datetime2-bahasai"
DESCRIPTION = "This package includes the documentation for texlive-datetime2-bahasai"
LICENSE = "LPPL-1.0"

PV = "2023.204.1.01svn46287"

RPM_NAME = "texlive-datetime2-bahasai-doc-2023.204.1.01svn46287-54.1.noarch.rpm"
RPM_HASH = "53702bb348edf50f9ef045ebe18781191dba57f844b8a65299e2751883a9014bd6a15de38d44f65dd7e494893d6258d03ca68b5601567535e92dab947c7672c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-bahasai-doc"

RDEPENDS:${PN} += ""

inherit rpm
