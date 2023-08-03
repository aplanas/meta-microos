SUMMARY = "Documentation for texlive-pst-geo"
DESCRIPTION = "This package includes the documentation for texlive-pst-geo"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.07svn60387"

RPM_NAME = "texlive-pst-geo-doc-2023.209.0.0.07svn60387-53.1.noarch.rpm"
RPM_HASH = "2ea817044b5442f4ed6d379b3f633bbb9736566b047c5479ddeac56869fc98a65c5d18a8e9a2ee40dc24b752f61aaaa16650c1c14a02f2cf6447a3949aca1f5f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-geo-doc"

RDEPENDS:${PN} += "/usr/bin/perl"

inherit rpm
