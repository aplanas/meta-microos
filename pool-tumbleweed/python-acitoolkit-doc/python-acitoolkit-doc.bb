SUMMARY = "Documentation for the Python acitoolkit library"
DESCRIPTION = "Documentation for python-acitoolkit."
LICENSE = "Apache-2.0"

PV = "0.4"

RPM_NAME = "python-acitoolkit-doc-0.4-6.1.noarch.rpm"
RPM_HASH = "b8bcc592f27a4291858f0861346972f60428510521f50ae9862ffb9c93340a219a0782ff4599ffd35c2d6d5cb37a3efb31b1009f26e9ab410813df83d45550c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-acitoolkit-doc"

RDEPENDS:${PN} += ""

inherit rpm
