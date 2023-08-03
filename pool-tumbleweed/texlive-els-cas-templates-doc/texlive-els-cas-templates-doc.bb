SUMMARY = "Documentation for texlive-els-cas-templates"
DESCRIPTION = "This package includes the documentation for texlive-els-cas-templates"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.3svn62931"

RPM_NAME = "texlive-els-cas-templates-doc-2023.209.2.3svn62931-54.1.noarch.rpm"
RPM_HASH = "b497436b36dd16c4c5a2edb3a65105e44e2e0fe3c6b3bfaff95170842edc3c5ecd40cf14dbe51e1ec642cac8cbe7a0bbec7d7856319bfca191a466b8a60d134f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-els-cas-templates-doc"

RDEPENDS:${PN} += ""

inherit rpm
