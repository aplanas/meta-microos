SUMMARY = "Documentation for texlive-epigrafica"
DESCRIPTION = "This package includes the documentation for texlive-epigrafica"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.01svn17210"

RPM_NAME = "texlive-epigrafica-doc-2023.201.1.01svn17210-53.2.noarch.rpm"
RPM_HASH = "a245466e476f8bad0936da3a3aeac00c76761f2ff47bcc70c417f16d615df142ec71f8991225d026a463606287cedd233d3edf03ac26454dce9ba8c20f0c2634"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-epigrafica-doc"

RDEPENDS:${PN} += ""

inherit rpm
