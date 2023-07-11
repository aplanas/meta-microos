SUMMARY = "Compatibility shim providing selectable entry points for older implementations"
DESCRIPTION = "Compatibility shim providing selectable entry points for older implementations"
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python310-backports.entry_points_selectable-1.2.0-2.1.noarch.rpm"
RPM_HASH = "0ef29becd85ee446f34718a8d79795cb45abeb2b2500ae3a4aefd398423080ea4ed33751282e40b6c7a72c2b6869cd61ee5604d7adec9a8d5ad54ac8432d204b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-backports.entry-points-selectable \
python310-backports.entry-points-selectable \
python3dist-backports.entry-points-selectable"

RDEPENDS:${PN} += "python-abi"

inherit rpm
