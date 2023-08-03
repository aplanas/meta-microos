SUMMARY = "Documentation for texlive-statistik"
DESCRIPTION = "This package includes the documentation for texlive-statistik"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.03svn20334"

RPM_NAME = "texlive-statistik-doc-2023.209.0.0.03svn20334-58.1.noarch.rpm"
RPM_HASH = "747aa3e9750f3edb2d4e07a33f75413317b185ddad0b7256bf620fc0846d6f77bf5713018c25b26d7b91ad3567b7a3437c5a66b034291d4175eabd3b71a1a96f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-statistik-doc"

RDEPENDS:${PN} += ""

inherit rpm
