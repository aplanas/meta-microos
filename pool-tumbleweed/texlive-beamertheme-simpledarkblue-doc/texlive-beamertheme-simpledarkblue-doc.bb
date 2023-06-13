SUMMARY = "Documentation for texlive-beamertheme-simpledarkblue"
DESCRIPTION = "This package includes the documentation for texlive-beamertheme-simpledarkblue"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn60061"

RPM_NAME = "texlive-beamertheme-simpledarkblue-doc-2023.201.svn60061-53.1.noarch.rpm"
RPM_HASH = "0b94b7b9cb570962c55670b5721ab4d3b20d6ed6eaa8fbe089f459ef1e112c496261eb79646d88d8654aa4cf1a74aa5529325f89c6e9ba7efb247d9db912cd1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-beamertheme-simpledarkblue-doc"

RDEPENDS:${PN} += ""

inherit rpm
