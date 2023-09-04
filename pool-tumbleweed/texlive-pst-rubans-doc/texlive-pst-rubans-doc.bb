SUMMARY = "Documentation for texlive-pst-rubans"
DESCRIPTION = "This package includes the documentation for texlive-pst-rubans"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn23464"

RPM_NAME = "texlive-pst-rubans-doc-2023.209.1.2svn23464-54.2.noarch.rpm"
RPM_HASH = "234eecf5faf0c017489eba53d6cada62f85c6a5deaf6ce5162a20d85e7083b33dfc5450a23e480adbfd7263066c163e150ae3d3140c2590cf9d46bf631f3d608"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-rubans-doc"

RDEPENDS:${PN} += ""

inherit rpm
