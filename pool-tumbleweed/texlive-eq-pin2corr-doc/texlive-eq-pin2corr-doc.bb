SUMMARY = "Documentation for texlive-eq-pin2corr"
DESCRIPTION = "This package includes the documentation for texlive-eq-pin2corr"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn59477"

RPM_NAME = "texlive-eq-pin2corr-doc-2023.209.svn59477-54.2.noarch.rpm"
RPM_HASH = "cd006a759e44afd10960634265d34830008ad0057e3273e3938eaa10ab4497611e2fb99605a4511d373d3a56b6232789cddf4c61d62d69776ece08f0d5ce81ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-eq-pin2corr-doc"

RDEPENDS:${PN} += ""

inherit rpm
