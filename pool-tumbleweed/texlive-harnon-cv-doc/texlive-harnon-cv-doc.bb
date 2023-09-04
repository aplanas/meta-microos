SUMMARY = "Documentation for texlive-harnon-cv"
DESCRIPTION = "This package includes the documentation for texlive-harnon-cv"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.1.0svn26543"

RPM_NAME = "texlive-harnon-cv-doc-2023.209.1.0svn26543-54.2.noarch.rpm"
RPM_HASH = "2ded4da29a9525fc49b4791fc3a348c1bb89040da471485812dec95a285a4b48cbadab3e8db82bf986b590012776cd0bd0705d6797dfbb221ae1a11ea6ad3aef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-harnon-cv-doc"

RDEPENDS:${PN} += ""

inherit rpm
