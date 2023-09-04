SUMMARY = "Documentation for texlive-hamnosys"
DESCRIPTION = "This package includes the documentation for texlive-hamnosys"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.3svn61941"

RPM_NAME = "texlive-hamnosys-doc-2023.209.1.0.3svn61941-54.2.noarch.rpm"
RPM_HASH = "22fd6445349034c3c1c3bb2be5b667712096bb649ae598c2c557f2272d9ab023336c5dd8c5468c23b98510407e14e566f5d9560d68d8dadd093abdc0694f54fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hamnosys-doc"

RDEPENDS:${PN} += ""

inherit rpm
