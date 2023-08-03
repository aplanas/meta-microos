SUMMARY = "Documentation for texlive-pgfornament"
DESCRIPTION = "This package includes the documentation for texlive-pgfornament"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn55326"

RPM_NAME = "texlive-pgfornament-doc-2023.209.1.2svn55326-52.1.noarch.rpm"
RPM_HASH = "4d2dbe7fb320ce570cb1616dd3780f43f2ff09e616fe17b5411e0cc7c97e44e21becbd3e5b38c1d83d0479cf2c5e06e01b52c7fa60a06a084af01fc0dd4fbc31"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pgfornament-doc"

RDEPENDS:${PN} += ""

inherit rpm
