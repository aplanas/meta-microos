SUMMARY = "Documentation for texlive-qsharp"
DESCRIPTION = "This package includes the documentation for texlive-qsharp"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3.1901.1401svn49722"

RPM_NAME = "texlive-qsharp-doc-2023.201.0.0.3.1901.1401svn49722-53.2.noarch.rpm"
RPM_HASH = "3d6cd14cf93486fc5125db843abe79209c63ae96810ca090f6d8e589222339beed95d9e37c5ef2218bc2c1a74f158708a7f9b56fde12fac0efcadb795a437b47"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-qsharp-doc"

RDEPENDS:${PN} += ""

inherit rpm
