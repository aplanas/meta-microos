SUMMARY = "Documentation for texlive-grid"
DESCRIPTION = "This package includes the documentation for texlive-grid"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn61719"

RPM_NAME = "texlive-grid-doc-2023.209.1.0svn61719-54.2.noarch.rpm"
RPM_HASH = "ba6806aa92343fa1aa40112d3f788c9cad9eed7bd1b78f81f3e3755d7d87aeea2a0967e4ef77494faaeb97bb1c22a0118b5ac276b6d336b78154699778a57625"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-grid-doc"

RDEPENDS:${PN} += ""

inherit rpm
