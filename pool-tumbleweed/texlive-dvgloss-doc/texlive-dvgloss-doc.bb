SUMMARY = "Documentation for texlive-dvgloss"
DESCRIPTION = "This package includes the documentation for texlive-dvgloss"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn29103"

RPM_NAME = "texlive-dvgloss-doc-2023.209.0.0.1svn29103-54.2.noarch.rpm"
RPM_HASH = "98dcabd6848464c85284b304ddcde3f33e13bdbfdbd9184115b173b3c5a51e5641f97adcb8b1bf4b67fbb2dd5369963550dda86f278cfe48210ca25c93a71732"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dvgloss-doc"

RDEPENDS:${PN} += ""

inherit rpm
