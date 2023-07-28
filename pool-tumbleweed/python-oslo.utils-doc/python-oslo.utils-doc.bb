SUMMARY = "Documentation for OpenStack utils library"
DESCRIPTION = "Documentation for OpenStack utils library."
LICENSE = "Apache-2.0"

PV = "6.2.0"

RPM_NAME = "python-oslo.utils-doc-6.2.0-1.1.noarch.rpm"
RPM_HASH = "9a7f80a9b05c57fb5d1b8a9dbfd86613170729ae0070f29a0779dba598ea0817d5720107845e2ab277fe187b7a64e8a5f21a86490f2513b3b970fb59dd9b6fe1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-oslo.utils-doc"

RDEPENDS:${PN} += ""

inherit rpm
