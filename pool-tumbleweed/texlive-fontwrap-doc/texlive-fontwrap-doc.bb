SUMMARY = "Documentation for texlive-fontwrap"
DESCRIPTION = "This package includes the documentation for texlive-fontwrap"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-fontwrap-doc-2023.201.svn15878-52.1.noarch.rpm"
RPM_HASH = "d7fadbe026e65c7240e39f47e2b89fa114929f1b443e282f62122e06402abf85dd4747d04968be66a65052efb623cc3358003865a669722f25def73799733d33"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fontwrap-doc"
RDEPENDS:${PN} += ""

inherit rpm
