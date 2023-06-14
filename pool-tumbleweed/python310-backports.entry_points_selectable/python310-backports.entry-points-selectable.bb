SUMMARY = "Compatibility shim providing selectable entry points for older implementations"
DESCRIPTION = "Compatibility shim providing selectable entry points for older implementations"
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python310-backports.entry_points_selectable-1.2.0-1.1.noarch.rpm"
RPM_HASH = "faea609cd03ef09c7a911f7ad401247c0818816e14fca4ec2c776a1243d3329dcfe5b74fbf2ae6c0ca53972e96c96227ce97f9e2153a2ee2b06d182f658ff9da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-backports.entry-points-selectable \
python3.10dist-backports.entry-points-selectable \
python310-backports.entry-points-selectable \
python3dist-backports.entry-points-selectable"

RDEPENDS:${PN} += "python-abi"

inherit rpm
