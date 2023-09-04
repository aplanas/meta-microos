SUMMARY = "Documentation for texlive-graphicx-psmin"
DESCRIPTION = "This package includes the documentation for texlive-graphicx-psmin"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn56931"

RPM_NAME = "texlive-graphicx-psmin-doc-2023.209.1.2svn56931-54.2.noarch.rpm"
RPM_HASH = "acf0ae98f98f700cf5f17b849a7eb51161640f264d6ef87f93749a198ac978889436082cafd1c385d385a112b635b3e7da4670feff2f9c2ffc2547c4cf211da5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-graphicx-psmin-doc"

RDEPENDS:${PN} += ""

inherit rpm
