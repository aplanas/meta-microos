SUMMARY = "Documentation for texlive-hhtensor"
DESCRIPTION = "This package includes the documentation for texlive-hhtensor"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.61svn54080"

RPM_NAME = "texlive-hhtensor-doc-2023.209.0.0.61svn54080-54.2.noarch.rpm"
RPM_HASH = "b058f2607598780caac63010c8680cc86582fe3f9ba8030eebe0a5a3427352b9f89a260855fdc5e8027ae48458f9f091d3d2224fc4cd4e4d563d328aaf36a92a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hhtensor-doc"

RDEPENDS:${PN} += ""

inherit rpm
