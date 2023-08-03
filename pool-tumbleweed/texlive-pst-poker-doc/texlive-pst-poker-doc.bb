SUMMARY = "Documentation for texlive-pst-poker"
DESCRIPTION = "This package includes the documentation for texlive-pst-poker"
LICENSE = "LGPL-2.1-or-later"

PV = "2023.209.0.0.03bsvn65818"

RPM_NAME = "texlive-pst-poker-doc-2023.209.0.0.03bsvn65818-54.1.noarch.rpm"
RPM_HASH = "7ef15b60be2ce1f01c16d9b52b806f8a3005952702a1fa704c8a80e874728df15739847967b513d745ca302d80e9faf11f70571e32943a5feb855eb7e7abd30b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-poker-doc"

RDEPENDS:${PN} += ""

inherit rpm
