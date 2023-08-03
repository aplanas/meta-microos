SUMMARY = "Documentation for texlive-byrne"
DESCRIPTION = "This package includes the documentation for texlive-byrne"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.2.2svn61943"

RPM_NAME = "texlive-byrne-doc-2023.209.0.0.2.2svn61943-53.1.noarch.rpm"
RPM_HASH = "27d53bca50f2b8633b6252e1375f72fa8f4859f6ba7a43f22d6a56d2c189de5829ec8815d318782453bb786017c3ebb2079231e4eb3bc215c86ff8cf7f6aed7a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-byrne-doc"

RDEPENDS:${PN} += ""

inherit rpm
