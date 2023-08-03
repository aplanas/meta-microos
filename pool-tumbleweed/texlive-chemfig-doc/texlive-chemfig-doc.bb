SUMMARY = "Documentation for texlive-chemfig"
DESCRIPTION = "This package includes the documentation for texlive-chemfig"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.6dsvn65912"

RPM_NAME = "texlive-chemfig-doc-2023.209.1.6dsvn65912-54.1.noarch.rpm"
RPM_HASH = "2943fde85d1c684a11427967b14cab7885f2f6527f8ac5d14965585dba1cd9b74e40c09e47554525adb8a98faba24377dc5f9d3cfb95d57eff804cb4f9fb14de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-chemfig-doc-en;fr \
texlive-chemfig-doc"

RDEPENDS:${PN} += ""

inherit rpm
