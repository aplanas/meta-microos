SUMMARY = "Documentation for texlive-rmpage"
DESCRIPTION = "This package includes the documentation for texlive-rmpage"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.92svn54080"

RPM_NAME = "texlive-rmpage-doc-2023.201.0.0.92svn54080-53.1.noarch.rpm"
RPM_HASH = "f9a4e433e3e7a2642c94ede47769e09b4d3ccc9049561996aeec7aebd539cf73e3842a3d95d58fa941a7b431942ee3635874c06e9c654966f435adfbc52ee509"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rmpage-doc"
RDEPENDS:${PN} += ""

inherit rpm
