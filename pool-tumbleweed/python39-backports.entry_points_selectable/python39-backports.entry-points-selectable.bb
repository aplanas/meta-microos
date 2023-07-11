SUMMARY = "Compatibility shim providing selectable entry points for older implementations"
DESCRIPTION = "Compatibility shim providing selectable entry points for older implementations"
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python39-backports.entry_points_selectable-1.2.0-2.1.noarch.rpm"
RPM_HASH = "c9c8678e3ce743e01af813212a62be3fd9ae83745da31980ea430024461a0ff0b1968b33e15675b0cc78a033f7757e33c01f9ac983e2a6eaa7e1499fafc6bba3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-backports.entry-points-selectable \
python39-backports.entry-points-selectable \
python3dist-backports.entry-points-selectable"

RDEPENDS:${PN} += "python-abi"

inherit rpm
