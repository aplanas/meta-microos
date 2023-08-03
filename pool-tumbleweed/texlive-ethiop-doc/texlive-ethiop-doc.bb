SUMMARY = "Documentation for texlive-ethiop"
DESCRIPTION = "This package includes the documentation for texlive-ethiop"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.7svn15878"

RPM_NAME = "texlive-ethiop-doc-2023.209.0.0.7svn15878-53.1.noarch.rpm"
RPM_HASH = "bfa8c5ef6f6a5f2c704056f91328ce55ab7573323ac3e7de586a2de7ab9d05f8ffcc588cd868d0368674f4eb59c0b5988f952c908ba2e193aacc4c2a162eb6e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ethiop-doc"

RDEPENDS:${PN} += ""

inherit rpm
