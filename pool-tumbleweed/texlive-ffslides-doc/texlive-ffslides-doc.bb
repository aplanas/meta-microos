SUMMARY = "Documentation for texlive-ffslides"
DESCRIPTION = "This package includes the documentation for texlive-ffslides"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn38895"

RPM_NAME = "texlive-ffslides-doc-2023.209.svn38895-53.1.noarch.rpm"
RPM_HASH = "faf6e0e9b83183f818205ec0498e9d51b98a64b847e1c92fe436c47e2466d650635a3575944d078c33ce4b38e632018f8f9ceba0c8d8e9c13fbd805659196990"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ffslides-doc"

RDEPENDS:${PN} += ""

inherit rpm
