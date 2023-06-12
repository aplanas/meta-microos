SUMMARY = "Documentation for texlive-footnotehyper"
DESCRIPTION = "This package includes the documentation for texlive-footnotehyper"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1esvn60374"

RPM_NAME = "texlive-footnotehyper-doc-2023.201.1.1esvn60374-52.1.noarch.rpm"
RPM_HASH = "9775174a371dbb986053505e22052ba33a43489d134df0ec81f3f900b4dac9d76e1bdf7386121cf4c8a00aca3d9cb2921a92d4e8355fb94999b756b993dba6d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-footnotehyper-doc"
RDEPENDS:${PN} += ""

inherit rpm
