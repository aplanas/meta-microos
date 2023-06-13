SUMMARY = "Documentation for texlive-selectp"
DESCRIPTION = "This package includes the documentation for texlive-selectp"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.1.0svn20185"

RPM_NAME = "texlive-selectp-doc-2023.201.1.0svn20185-53.1.noarch.rpm"
RPM_HASH = "d399b36d24d7867c9f3e6f80ab29bd3b34523083ab0631b9a5e60c3dfa0a5fa5e8a416b36fbd4f5f9355ee4b7b803c90468d4beb3b39f0ce5b566966abedbf69"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-selectp-doc"

RDEPENDS:${PN} += ""

inherit rpm
