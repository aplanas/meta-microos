SUMMARY = "Documentation for texlive-pst-abspos"
DESCRIPTION = "This package includes the documentation for texlive-pst-abspos"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn15878"

RPM_NAME = "texlive-pst-abspos-doc-2023.209.0.0.2svn15878-53.1.noarch.rpm"
RPM_HASH = "9a24f177a4090f540de33f191d0c5143bb093f20410f9d7e4cec2bba9574c8ec568d805bf5c6a11e186a2ee8bfc66495dbd8198628f603e53d91d6d957c975ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-abspos-doc"

RDEPENDS:${PN} += ""

inherit rpm
