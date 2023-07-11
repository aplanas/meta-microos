SUMMARY = "Open vSwitch Documentation"
DESCRIPTION = "Contains additional documentation for the Open vSwitch."
LICENSE = "Apache-2.0"

PV = "3.1.0"

RPM_NAME = "openvswitch-doc-3.1.0-14.3.noarch.rpm"
RPM_HASH = "6a47972148daad7ebb6d71cc1425fc75dee2ca83c7126c8dd85e1657321e3d1437ef285f913e5e99cc42e9f26d8715896129c666b1d06ab8e071fd298e5f99af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openvswitch-doc"

RDEPENDS:${PN} += ""

inherit rpm
