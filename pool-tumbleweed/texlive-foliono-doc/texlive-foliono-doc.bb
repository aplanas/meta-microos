SUMMARY = "Documentation for texlive-foliono"
DESCRIPTION = "This package includes the documentation for texlive-foliono"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.000svn58877"

RPM_NAME = "texlive-foliono-doc-2023.209.1.000svn58877-53.1.noarch.rpm"
RPM_HASH = "b969bbd4e0500b2c3c538ea3e7bf2bdcb3bd1593429569b67fb8ffc7cd0371daa3e87e47564d2df2852586b3b94d22d987bbbd8d2f9aa2ebe0e5414eff3baad1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-foliono-doc"

RDEPENDS:${PN} += ""

inherit rpm
