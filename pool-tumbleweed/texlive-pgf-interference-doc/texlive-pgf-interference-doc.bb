SUMMARY = "Documentation for texlive-pgf-interference"
DESCRIPTION = "This package includes the documentation for texlive-pgf-interference"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn61562"

RPM_NAME = "texlive-pgf-interference-doc-2023.201.0.0.1svn61562-51.1.noarch.rpm"
RPM_HASH = "5f52384a0c6886c774d378b22a956378f5ec2c4d6a0e94a5bb9b9995640c4bf674cb1e61eb1503453253349b0f288be0f0e9601211a3c7d7acb8f154dae7562b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-pgf-interference-doc:de;en) \
texlive-pgf-interference-doc"

RDEPENDS:${PN} += ""

inherit rpm
