SUMMARY = "Documentation for texlive-showcharinbox"
DESCRIPTION = "This package includes the documentation for texlive-showcharinbox"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn29803"

RPM_NAME = "texlive-showcharinbox-doc-2023.201.0.0.1svn29803-53.1.noarch.rpm"
RPM_HASH = "3a482d5d148ec46b170251084fc6ab9f2c6d82b2f5578d66d293fa45bd9496900e199bdeb7b81d3898e9d292e3c7e8130d8fa18e40fe9c5f3aaecde050133616"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-showcharinbox-doc"

RDEPENDS:${PN} += ""

inherit rpm
