SUMMARY = "Documentation for texlive-pst-calendar"
DESCRIPTION = "This package includes the documentation for texlive-pst-calendar"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.48svn60480"

RPM_NAME = "texlive-pst-calendar-doc-2023.201.0.0.48svn60480-52.1.noarch.rpm"
RPM_HASH = "a42ec3c58270d2bc591dac54a14589357b67a068e6a4b0118d9f35bf8c420ff2107fe6d8fc5d0a84ff8fd948af82e013e28c5db29e9a18bbc0aa892c2a25c942"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-calendar-doc"

RDEPENDS:${PN} += ""

inherit rpm
