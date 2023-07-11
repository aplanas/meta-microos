SUMMARY = "Compatibility shim providing selectable entry points for older implementations"
DESCRIPTION = "Compatibility shim providing selectable entry points for older implementations"
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python311-backports.entry_points_selectable-1.2.0-2.1.noarch.rpm"
RPM_HASH = "b5d2ba9608201d2ca0a7065eb1846b25c92f8f3695de185e7491adf0a2b9075b3d75352d101c0f92a1d6dc4a84cab23682b111f689e7fa74f4daae5eef7ac833"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-backports.entry-points-selectable \
python3.11dist-backports.entry-points-selectable \
python311-backports.entry-points-selectable \
python3dist-backports.entry-points-selectable"

RDEPENDS:${PN} += "python-abi"

inherit rpm
