SUMMARY = "Documentation for texlive-conditext"
DESCRIPTION = "This package includes the documentation for texlive-conditext"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.5svn55387"

RPM_NAME = "texlive-conditext-doc-2023.201.1.5svn55387-53.1.noarch.rpm"
RPM_HASH = "e86f000d1e453b809e46f0474bbce42487e0dd4aa3bb3eb8a7a48e4af5ec4db2fa132e9291e76322db1c685c30292709d445fba6c3a57116e6f3cacce72921e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-conditext-doc"
RDEPENDS:${PN} += ""

inherit rpm
