SUMMARY = "Documentation for texlive-texpower"
DESCRIPTION = "This package includes the documentation for texlive-texpower"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.2svn29349"

RPM_NAME = "texlive-texpower-doc-2023.209.0.0.2svn29349-55.1.noarch.rpm"
RPM_HASH = "ad42308b73fc5047cbe4fb7785b7b9a278a4d1b6dab0f9d05a06b8d0da2c48e3cdd1ff550d11d982a1afe1049810bd4de47344b9a62bd0cf63503d6b22caa6fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-texpower-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
