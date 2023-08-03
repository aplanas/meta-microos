SUMMARY = "Documentation for texlive-wasysym"
DESCRIPTION = "This package includes the documentation for texlive-wasysym"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.4svn54080"

RPM_NAME = "texlive-wasysym-doc-2023.209.2.4svn54080-54.1.noarch.rpm"
RPM_HASH = "7466cf72d1ea02b50ce39c56cbf00ca0e4ee723112da6dddbe451abb46bab8b6852a19797d5c7927dec609ffccc2e9c0b0e84a68bf776c0ecb30ce6ce554e7f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-wasysym-doc"

RDEPENDS:${PN} += ""

inherit rpm
