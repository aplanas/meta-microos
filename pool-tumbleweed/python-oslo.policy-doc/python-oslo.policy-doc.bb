SUMMARY = "Documentation for the Oslo Policy library"
DESCRIPTION = "Documentation for the Oslo Policy library."
LICENSE = "Apache-2.0"

PV = "4.1.1"

RPM_NAME = "python-oslo.policy-doc-4.1.1-1.3.noarch.rpm"
RPM_HASH = "a782ade4dfbf698dfb9899c4f9f5842992fc33bd2b6384d96a7292bba17af51901c72085937681b641a40445a94ee56897282afbc53c5258c36be99b1711ad0d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-oslo.policy-doc"

RDEPENDS:${PN} += ""

inherit rpm
