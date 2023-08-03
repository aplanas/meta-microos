SUMMARY = "Documentation for texlive-jupynotex"
DESCRIPTION = "This package includes the documentation for texlive-jupynotex"
LICENSE = "Apache-1.0"

PV = "2023.209.0.0.1svn56715"

RPM_NAME = "texlive-jupynotex-doc-2023.209.0.0.1svn56715-56.1.noarch.rpm"
RPM_HASH = "d502bca4796983773e7faf075f3e008931b4ebcee47fdf3f43561afcb89a0c62ebf0d258dd2c5075f386198c7cb696cff2cb4b543b8205594247585277f779bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-jupynotex-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
