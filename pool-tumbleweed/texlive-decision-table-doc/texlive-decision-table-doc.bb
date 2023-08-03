SUMMARY = "Documentation for texlive-decision-table"
DESCRIPTION = "This package includes the documentation for texlive-decision-table"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.0.4svn60673"

RPM_NAME = "texlive-decision-table-doc-2023.209.0.0.0.4svn60673-53.1.noarch.rpm"
RPM_HASH = "2e75c20baba4ae6e43cba2706e61b8b22768c5475a27e89469d716eb5a4efbc6697ce51bfcec28eded8f70a6d415212d80fa7ca075b90d505f45505a0ea768cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-decision-table-doc"

RDEPENDS:${PN} += ""

inherit rpm
