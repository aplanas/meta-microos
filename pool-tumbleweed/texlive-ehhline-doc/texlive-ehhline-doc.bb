SUMMARY = "Documentation for texlive-ehhline"
DESCRIPTION = "This package includes the documentation for texlive-ehhline"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn54676"

RPM_NAME = "texlive-ehhline-doc-2023.209.1.1svn54676-54.1.noarch.rpm"
RPM_HASH = "120d35f05d79fbae1168d77badb3d432a3e23ba1328f43dd46db9e054cd5eb4cdbfe2b4ded64e08e8355cd5822941db503de9722be12831774ffe343731f6953"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ehhline-doc"

RDEPENDS:${PN} += ""

inherit rpm
