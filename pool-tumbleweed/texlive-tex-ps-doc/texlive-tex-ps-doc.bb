SUMMARY = "Documentation for texlive-tex-ps"
DESCRIPTION = "This package includes the documentation for texlive-tex-ps"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-tex-ps-doc-2023.209.svn15878-55.1.noarch.rpm"
RPM_HASH = "b86ef8d791d89a34a7700d56cdfa81b070372ac7f16f4d13d7e6a60c1dde4036d553f1024b3f75699583c90e2708b97492b82c61a22045263315a5e33974210d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tex-ps-doc"

RDEPENDS:${PN} += ""

inherit rpm
