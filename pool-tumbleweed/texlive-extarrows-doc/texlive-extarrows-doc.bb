SUMMARY = "Documentation for texlive-extarrows"
DESCRIPTION = "This package includes the documentation for texlive-extarrows"
LICENSE = "LGPL-2.1-or-later"

PV = "2023.209.1.2.0svn54400"

RPM_NAME = "texlive-extarrows-doc-2023.209.1.2.0svn54400-53.1.noarch.rpm"
RPM_HASH = "dddd57754ae7acfab8e3b7f8325c0dcac5e3574abe961e6b802c7a8285b11249f0d007aa229f629fd72996ad289699672fd125eaf97edd42d91a4b5d0ac151db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-extarrows-doc"

RDEPENDS:${PN} += ""

inherit rpm
