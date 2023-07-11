SUMMARY = "Documentation for the DMTF Cloud Audit (CADF) data model"
DESCRIPTION = "Documentation for the DMTF Cloud Audit (CADF) data model."
LICENSE = "Apache-2.0"

PV = "3.1.1"

RPM_NAME = "python-pycadf-doc-3.1.1-2.6.noarch.rpm"
RPM_HASH = "0c03a3e5754e3a12995fe098b3114eee6027801dffa3c9ec713140f38ed08b202af123305ac108503558150520e5b9f381edaf1b1aaf62a7017fb8c7db973d5d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-pycadf-doc"

RDEPENDS:${PN} += ""

inherit rpm
