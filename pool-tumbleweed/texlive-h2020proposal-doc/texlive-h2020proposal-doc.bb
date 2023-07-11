SUMMARY = "Documentation for texlive-h2020proposal"
DESCRIPTION = "This package includes the documentation for texlive-h2020proposal"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.0svn38428"

RPM_NAME = "texlive-h2020proposal-doc-2023.201.1.0svn38428-53.2.noarch.rpm"
RPM_HASH = "cd7398cb18d119f0a0198c9087653424d8a583f4608d4d106cb96567e44ec34fd4129fc3f097b16c795b902b586425872607b635e6f8509eff7f60ce8722f0ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-h2020proposal-doc"

RDEPENDS:${PN} += ""

inherit rpm
