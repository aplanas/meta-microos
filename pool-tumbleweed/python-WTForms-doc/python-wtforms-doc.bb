SUMMARY = "Documentation for WTForms"
DESCRIPTION = "Documentation for WTForms, which is a forms validation and rendering library for Python web development."
LICENSE = "BSD-3-Clause"

PV = "3.0.1"

RPM_NAME = "python-WTForms-doc-3.0.1-2.8.noarch.rpm"
RPM_HASH = "56a968f343da7d98f923250af139fc3a2eea45eae5d58fd29c6cf3cb824c96b1f49f55948577364a86a516a52f815eafc3036573d202dedda88beaecdba4df41"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-WTForms-doc"

RDEPENDS:${PN} += ""

inherit rpm
