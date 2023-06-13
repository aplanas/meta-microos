SUMMARY = "Documentation for texlive-robustindex"
DESCRIPTION = "This package includes the documentation for texlive-robustindex"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn49877"

RPM_NAME = "texlive-robustindex-doc-2023.201.svn49877-53.1.noarch.rpm"
RPM_HASH = "961928790c02113b23789ecc6da1c470431d4c654d3096b98914cd75bea447f4a12f8a200644ec84e7755ef1636cbe5a75148d204d1b5791c0dffd6702936b37"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-robustindex-doc"

RDEPENDS:${PN} += ""

inherit rpm
