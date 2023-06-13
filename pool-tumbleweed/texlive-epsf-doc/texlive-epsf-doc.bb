SUMMARY = "Documentation for texlive-epsf"
DESCRIPTION = "This package includes the documentation for texlive-epsf"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.2.7.4svn21461"

RPM_NAME = "texlive-epsf-doc-2023.201.2.7.4svn21461-53.1.noarch.rpm"
RPM_HASH = "89dad594ffc43ec13e6e68d9c80977da7df40e6086e62aca5e18789e42a70f89c7e25618b40a463c533dbc46b7b50760316b9561a2bfb796d1f4a2a21a5fbefe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-epsf-doc"

RDEPENDS:${PN} += "/bin/sh"

inherit rpm
