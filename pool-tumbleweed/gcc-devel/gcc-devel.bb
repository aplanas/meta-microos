SUMMARY = "The system GNU C Compiler Plugin development files"
DESCRIPTION = "The system GNU C Compiler Plugin development files."
LICENSE = "GPL-3.0-or-later"

PV = "13"

RPM_NAME = "gcc-devel-13-1.3.aarch64.rpm"
RPM_HASH = "2c22ea70b8ccf2bc03df1c28ec0b5ee513b856975849274e6a1f6eb4c464fdee93b1b6cfddf38a5cc8e5683f2e8c6b1691e37345483b6996922e049c488f2311"

RPROVIDES:${PN} += "gcc-devel \
gcc-devel(aarch-64)"
RDEPENDS:${PN} += "gcc \
gcc13-devel"

inherit rpm
