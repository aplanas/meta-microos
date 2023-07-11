SUMMARY = "Iterative JSON parser with a standard Python iterator interface"
DESCRIPTION = "Iterative JSON parser with a standard Python iterator interface."
LICENSE = "BSD-3-Clause"

PV = "3.1.4"

RPM_NAME = "python311-ijson-3.1.4-2.2.aarch64.rpm"
RPM_HASH = "a223a7324280f3b01245758d3e57daf2e7468f16319beecd619b7fe93584603bd446fb9edbcbc05a04f0dd6a763f2789dfff28b162943ce3129a1c6db9ca113a"

RPROVIDES:${PN} += "python3-ijson \
python3.11dist-ijson \
python311-ijson \
python3dist-ijson"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libyajl.so.2 \
python-abi"

inherit rpm
