SUMMARY = "Container disk for kubevirt"
DESCRIPTION = "The containter-disk package provides a container disk functionality for kubevirt"
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "kubevirt-container-disk-1.0.0-3.1.aarch64.rpm"
RPM_HASH = "f5947b8cb0512823c7f3fabb93d95781a23badf30330781373e8d906228b418ced34eff5d0ecf024f1e0902fc78ef94160d7f444c66e319aaefbb9fd359ae8d5"

RPROVIDES:${PN} += "kubevirt-container-disk"

RDEPENDS:${PN} += ""

inherit rpm
