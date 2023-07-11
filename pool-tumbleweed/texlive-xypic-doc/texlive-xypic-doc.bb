SUMMARY = "Documentation for texlive-xypic"
DESCRIPTION = "This package includes the documentation for texlive-xypic"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.3.8.9svn61719"

RPM_NAME = "texlive-xypic-doc-2023.201.3.8.9svn61719-52.2.noarch.rpm"
RPM_HASH = "0bd6a51829efef170b0eaeeae32432fe9bf2c11eaa868dcd5e35ab20cd7f7749938ddf58ece6b59aa253827d4c01c386e84c0f2b71a2a714d914825b151138ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-xypic-doc-en \
texlive-xypic-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
