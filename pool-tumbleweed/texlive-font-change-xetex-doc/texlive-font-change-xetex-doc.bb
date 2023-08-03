SUMMARY = "Documentation for texlive-font-change-xetex"
DESCRIPTION = "This package includes the documentation for texlive-font-change-xetex"
LICENSE = "LPPL-1.0"

PV = "2023.209.2016.1svn40404"

RPM_NAME = "texlive-font-change-xetex-doc-2023.209.2016.1svn40404-53.1.noarch.rpm"
RPM_HASH = "68abd7f06e6590398b5f1eb63761c8f0d43a5f8c4a2370cf75f8569b97775147ca26142dc50931152a6eb825cb64af00d678b8f80ace7005dad23beb34912e97"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-font-change-xetex-doc"

RDEPENDS:${PN} += ""

inherit rpm
