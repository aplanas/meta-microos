SUMMARY = "Documentation for texlive-gridslides"
DESCRIPTION = "This package includes the documentation for texlive-gridslides"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1.1svn54512"

RPM_NAME = "texlive-gridslides-doc-2023.209.0.0.1.1svn54512-54.2.noarch.rpm"
RPM_HASH = "e0e3621127cee5d3d6b06a34d797eb9dcc45af90edcb59832049a50a1c4e624a2e71a322d2ad26ab0dbbc5ef19180d50acc26ef3f58f7982b7781e101a699801"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gridslides-doc"

RDEPENDS:${PN} += "/usr/bin/perl"

inherit rpm
