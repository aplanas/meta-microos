SUMMARY = "Documentation for texlive-xmltex"
DESCRIPTION = "This package includes the documentation for texlive-xmltex"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.8svn62145"

RPM_NAME = "texlive-xmltex-doc-2023.209.0.0.8svn62145-53.2.noarch.rpm"
RPM_HASH = "5203ea6f6cf579f5debea645fa51a5534256a6dea242a96223c270bbd0d66eeed518ccc47ac2d439c7fb4bd07003826be666458c240c1d7ad790122d21dcb072"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xmltex-doc"

RDEPENDS:${PN} += ""

inherit rpm
