SUMMARY = "Documentation for texlive-udes-genie-these"
DESCRIPTION = "This package includes the documentation for texlive-udes-genie-these"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.0.1svn65039"

RPM_NAME = "texlive-udes-genie-these-doc-2023.201.3.0.1svn65039-53.1.noarch.rpm"
RPM_HASH = "302e21ff28e07e5d850fa8887763b9432387632c5e6ee1f883076ef654db5de406062c39e6e3dba154d77644e668269a505d633f868a14c0a43321fb3317914f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-udes-genie-these-doc:fr-ca) \
texlive-udes-genie-these-doc"

RDEPENDS:${PN} += ""

inherit rpm
