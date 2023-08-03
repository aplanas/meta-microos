SUMMARY = "Documentation for texlive-calculation"
DESCRIPTION = "This package includes the documentation for texlive-calculation"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn35973"

RPM_NAME = "texlive-calculation-doc-2023.209.1.0svn35973-53.1.noarch.rpm"
RPM_HASH = "7ae90b0fcbb061f5de5543a9e879594be093e9c1631c25e4ba1b0e4148ae4dac36c19f6826e0105f4faef0158f69eb7bcb0535886be98f1e1bf542f57624985b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-calculation-doc"

RDEPENDS:${PN} += ""

inherit rpm
