SUMMARY = "Documentation for texlive-sageep"
DESCRIPTION = "This package includes the documentation for texlive-sageep"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn15878"

RPM_NAME = "texlive-sageep-doc-2023.209.1.0svn15878-54.1.noarch.rpm"
RPM_HASH = "c56845d549ff5fe1731c6f224d9a5a450fef14c8f43b3fbdfc26e1c7cf84b53d230d5dc3ee0d12175283978a7f58f2f90596afd00ee28e64453eb313b10af31e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sageep-doc"

RDEPENDS:${PN} += ""

inherit rpm
