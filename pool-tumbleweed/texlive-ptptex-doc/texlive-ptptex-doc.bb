SUMMARY = "Documentation for texlive-ptptex"
DESCRIPTION = "This package includes the documentation for texlive-ptptex"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.91svn19440"

RPM_NAME = "texlive-ptptex-doc-2023.201.0.0.91svn19440-53.1.noarch.rpm"
RPM_HASH = "40d3bbe8111faa55cf6505fe56021c97974d556f0cc59ea4c798deec3bade6595c1240f7f8f98ae3c35801be0fd689dd8c97226d61373f0f3fd7e80cb1d13184"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ptptex-doc"

RDEPENDS:${PN} += ""

inherit rpm
