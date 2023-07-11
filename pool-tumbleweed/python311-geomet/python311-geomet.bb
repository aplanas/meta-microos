SUMMARY = "GeoJSON <-> WKT/WKB conversion utilities"
DESCRIPTION = "GeoJSON <-> WKT/WKB conversion utilities"
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "python311-geomet-1.0.0-1.3.noarch.rpm"
RPM_HASH = "523e8a318b7be133d6ab25700e437264043d3905457d2b8ff6d75231f4be7012f9c3b498fa658a6345f151367b2658904035e06d21eb3216a496bbe302b782cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-geomet \
python3.11dist-geomet \
python311-geomet \
python3dist-geomet"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-click \
update-alternatives"

inherit rpm
