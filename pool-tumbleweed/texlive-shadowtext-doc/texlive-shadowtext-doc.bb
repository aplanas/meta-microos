SUMMARY = "Documentation for texlive-shadowtext"
DESCRIPTION = "This package includes the documentation for texlive-shadowtext"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3svn26522"

RPM_NAME = "texlive-shadowtext-doc-2023.209.0.0.3svn26522-54.1.noarch.rpm"
RPM_HASH = "ef0662af9bfe52fc2fc66339e149024b72e15f187693c4bf28f060ff6e0049e784a1661053d95a0a7a3079fd3f93928fc2a5430e8d354ff084f1f6de65824b12"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-shadowtext-doc"

RDEPENDS:${PN} += ""

inherit rpm
