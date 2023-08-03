SUMMARY = "Documentation for texlive-datetime2-croatian"
DESCRIPTION = "This package includes the documentation for texlive-datetime2-croatian"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn36682"

RPM_NAME = "texlive-datetime2-croatian-doc-2023.209.1.0svn36682-53.1.noarch.rpm"
RPM_HASH = "bc2a9e474f58ebf0d48138420ddb82701cc6e0414d39b3486ae604f6684e6ce941c14ebcbdb63671fe47c0272e47e8277fcfec33bc2f684494af6fde03fff142"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-croatian-doc"

RDEPENDS:${PN} += ""

inherit rpm
