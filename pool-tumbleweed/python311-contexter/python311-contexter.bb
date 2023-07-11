SUMMARY = "A replacement of the contextlib module"
DESCRIPTION = "Contexter is a full replacement of the contextlib standard library \
module."
LICENSE = "MIT"

PV = "0.1.4"

RPM_NAME = "python311-contexter-0.1.4-2.15.noarch.rpm"
RPM_HASH = "ca9471a75622becd1509a99db380a58dc72eebdcb0e63cc07ed91dae5cd3820575652d12d3939a7e422398585e97a532ee24c14301fc635960026133133c7858"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-contexter \
python3.11dist-contexter \
python311-contexter \
python3dist-contexter"

RDEPENDS:${PN} += "python-abi"

inherit rpm
