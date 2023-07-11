SUMMARY = "Click params for commmand line interfaces to GeoJSON"
DESCRIPTION = "Common arguments and options for GeoJSON processing commands, using Click."
LICENSE = "BSD-3-Clause"

PV = "0.7.2"

RPM_NAME = "python311-cligj-0.7.2-1.7.noarch.rpm"
RPM_HASH = "cf195a0ab72f118a2d741af086b897b83cb7ddb5d9964b76137da08ec6ea9d105d6eb9f02489563e15395e9dda1c803c9a60d372548aa0b540aacd96a02e2c7a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cligj \
python3.11dist-cligj \
python311-cligj \
python3dist-cligj"

RDEPENDS:${PN} += "python-abi \
python311-click"

inherit rpm
