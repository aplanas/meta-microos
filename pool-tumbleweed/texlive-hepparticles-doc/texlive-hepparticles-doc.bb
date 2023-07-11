SUMMARY = "Documentation for texlive-hepparticles"
DESCRIPTION = "This package includes the documentation for texlive-hepparticles"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0svn35723"

RPM_NAME = "texlive-hepparticles-doc-2023.201.2.0svn35723-53.2.noarch.rpm"
RPM_HASH = "61c6343b093c0924ee2fa5fcc3170aaa97369814ba8ac24c94680ca74256206174cdc6f3cad6b896aa1c768e3bfee812c95dc519f1ee38f2375e8d33e9e31c36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hepparticles-doc"

RDEPENDS:${PN} += ""

inherit rpm
