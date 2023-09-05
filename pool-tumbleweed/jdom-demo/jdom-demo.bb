SUMMARY = "Demos for jdom"
DESCRIPTION = "Demonstrations and samples for jdom."
LICENSE = "Saxpath"

PV = "1.1.3"

RPM_NAME = "jdom-demo-1.1.3-40.1.noarch.rpm"
RPM_HASH = "fab23f98624a64468cf1e3369c550a89f22b216283bb2744603732efb2ff756769613704929f60fe1a5f6b980a23784a0f7af13fc3ae3fb2ef473117e90e4c95"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jdom-demo"

RDEPENDS:${PN} += "jdom"

inherit rpm
