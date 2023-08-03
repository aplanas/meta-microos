SUMMARY = "Documentation for texlive-biber-ms"
DESCRIPTION = "This package includes the documentation for texlive-biber-ms"
LICENSE = "Artistic-2.0 & GPL-2.0-or-later"

PV = "2023.209.4.0_1svn66478"

RPM_NAME = "texlive-biber-ms-doc-2023.209.4.0_1svn66478-54.1.noarch.rpm"
RPM_HASH = "3b43a7d4c67606e50e4ddd638428e1dc47f477a3022b4b04d456f296fcce8f91a70248ff6b51d4170ebe3273317cd7e4ce2512534df7915143e97ccfb5796fcc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biber-ms-doc"

RDEPENDS:${PN} += ""

inherit rpm
