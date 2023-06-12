SUMMARY = "Click params for commmand line interfaces to GeoJSON"
DESCRIPTION = "Common arguments and options for GeoJSON processing commands, using Click."
LICENSE = "BSD-3-Clause"

PV = "0.7.2"

RPM_NAME = "python39-cligj-0.7.2-1.5.noarch.rpm"
RPM_HASH = "ea2df8fc6a83d8328127ead09d93d149a512582fa6791e1b779b2543c9ac26b5ed98cc1e5f09b08dc18cb5304b641509ae16b940b52c08af2960254573565d65"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(cligj) \
python39-cligj \
python3dist(cligj)"
RDEPENDS:${PN} += "python(abi) \
python39-click"

inherit rpm
