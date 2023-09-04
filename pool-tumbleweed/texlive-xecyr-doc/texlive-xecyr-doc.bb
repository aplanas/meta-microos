SUMMARY = "Documentation for texlive-xecyr"
DESCRIPTION = "This package includes the documentation for texlive-xecyr"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn54308"

RPM_NAME = "texlive-xecyr-doc-2023.209.1.2svn54308-53.2.noarch.rpm"
RPM_HASH = "d74fa1f8ec837abe9321d659b6a0176727ddbb97b4e6d5cdbad2f75eaf648846260a441df0a82b162f25487b8a24e311ae545107b55209e8c3358f8348d8bffa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-xecyr-doc-ru \
texlive-xecyr-doc"

RDEPENDS:${PN} += ""

inherit rpm
