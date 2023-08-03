SUMMARY = "Documentation for texlive-kotex-utils"
DESCRIPTION = "This package includes the documentation for texlive-kotex-utils"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.1.0svn38727"

RPM_NAME = "texlive-kotex-utils-doc-2023.209.2.1.0svn38727-56.1.noarch.rpm"
RPM_HASH = "ee2e405458a88fcd1f074b9f751c1e6cd14a59ac1a5468855d0eb51ebc01bd4709a4a08f6e080824a14142bc8d58e1f77ffe4d11229f9841dd5aa399b036347d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-kotex-utils-doc"

RDEPENDS:${PN} += ""

inherit rpm
