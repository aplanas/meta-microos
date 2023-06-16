SUMMARY = "Documentation for texlive-featpost"
DESCRIPTION = "This package includes the documentation for texlive-featpost"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.8.8svn35346"

RPM_NAME = "texlive-featpost-doc-2023.201.0.0.8.8svn35346-52.1.noarch.rpm"
RPM_HASH = "8d971a97f152d92463f145b0e83e347b2250c49d21e0c8d519c015ca495d8205e8e4b33e8d46bb716232519b6f609f9f8d1beaa491c71c188994c51137d2f162"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-featpost-doc"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh"

inherit rpm
