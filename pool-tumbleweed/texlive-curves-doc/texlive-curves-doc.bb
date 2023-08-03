SUMMARY = "Documentation for texlive-curves"
DESCRIPTION = "This package includes the documentation for texlive-curves"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.55svn45255"

RPM_NAME = "texlive-curves-doc-2023.209.1.55svn45255-55.1.noarch.rpm"
RPM_HASH = "67025499bf9aaa3d0057dd12d81e5673d11c70c5b0f36c9db827ec38fcb40b6523d2390f5104fea5beb85a9c782511479cbdaa65b973f6480496cb778be9721e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-curves-doc"

RDEPENDS:${PN} += ""

inherit rpm
