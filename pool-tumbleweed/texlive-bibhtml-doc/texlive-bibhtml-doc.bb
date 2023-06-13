SUMMARY = "Documentation for texlive-bibhtml"
DESCRIPTION = "This package includes the documentation for texlive-bibhtml"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.2.0.2svn31607"

RPM_NAME = "texlive-bibhtml-doc-2023.201.2.0.2svn31607-53.1.noarch.rpm"
RPM_HASH = "8a9884a8224801edfefcf572cc4fbfbdac165713f6d14332a7f8ddff00efe21aa244a3d6b32955f95ef4499ca846f8542af13c6c512a232e6742e622d55f5533"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bibhtml-doc"

RDEPENDS:${PN} += "/usr/bin/perl"

inherit rpm
