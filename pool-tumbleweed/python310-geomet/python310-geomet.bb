SUMMARY = "GeoJSON <-> WKT/WKB conversion utilities"
DESCRIPTION = "GeoJSON <-> WKT/WKB conversion utilities"
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "python310-geomet-1.0.0-1.3.noarch.rpm"
RPM_HASH = "17a95d36b213726c8c4b4175890dcbbcb4ccf72fd5d26e158d3d2582428813c424e8491c0e9cd5ef51832324265506081738966dfc9ada65f4af36ece07ac855"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-geomet \
python310-geomet \
python3dist-geomet"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-click \
update-alternatives"

inherit rpm
