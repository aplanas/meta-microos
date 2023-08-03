SUMMARY = "Documentation for texlive-bibhtml"
DESCRIPTION = "This package includes the documentation for texlive-bibhtml"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.2.0.2svn31607"

RPM_NAME = "texlive-bibhtml-doc-2023.209.2.0.2svn31607-54.1.noarch.rpm"
RPM_HASH = "62984c025378c37b6a3a19af14aeec9fd79988d9e1d2baba645e9004db48c0ca8dae9406dfe6acf7e22a1a6a1fd09bf2d2abb076bb38ad3715d4fb348aa67d00"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bibhtml-doc"

RDEPENDS:${PN} += "/usr/bin/perl"

inherit rpm
