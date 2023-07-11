SUMMARY = "Documentation for texlive-eq-pin2corr"
DESCRIPTION = "This package includes the documentation for texlive-eq-pin2corr"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn59477"

RPM_NAME = "texlive-eq-pin2corr-doc-2023.201.svn59477-53.2.noarch.rpm"
RPM_HASH = "2efee32de4aaec0a53db02d1a2a5b3e37ca45402b961c2645a895ea0fa9f465ac16bcb667d4fb49d185c60179d68a0a1129e45f19b0f64eedcc50e672bb775ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-eq-pin2corr-doc"

RDEPENDS:${PN} += ""

inherit rpm
