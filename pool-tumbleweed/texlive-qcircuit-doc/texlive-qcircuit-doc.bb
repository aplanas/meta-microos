SUMMARY = "Documentation for texlive-qcircuit"
DESCRIPTION = "This package includes the documentation for texlive-qcircuit"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.2.6.0svn48400"

RPM_NAME = "texlive-qcircuit-doc-2023.201.2.6.0svn48400-53.2.noarch.rpm"
RPM_HASH = "c968a29de827642bc0b579405690b1a3bfa89bb7f364b19bd29ed45c3f9e6d894a5c96ba07dac6e9e88da693a4cf03ef9225ebcc7dc21b45b61664777fe2dc23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-qcircuit-doc"

RDEPENDS:${PN} += ""

inherit rpm
