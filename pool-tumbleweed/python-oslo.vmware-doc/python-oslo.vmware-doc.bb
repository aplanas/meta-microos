SUMMARY = "Documentation for OpenStack common VMware library"
DESCRIPTION = "Documentation for OpenStack common VMware library."
LICENSE = "Apache-2.0"

PV = "4.1.1"

RPM_NAME = "python-oslo.vmware-doc-4.1.1-1.2.noarch.rpm"
RPM_HASH = "260e817202b6162484b33613f16e19d89dc42b298525cfbd168b02cbb1e38019655aa634a163521d970fadfd26b8f538a4384265d4d97aea97a3d57242cc9668"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-oslo.vmware-doc"

RDEPENDS:${PN} += ""

inherit rpm
