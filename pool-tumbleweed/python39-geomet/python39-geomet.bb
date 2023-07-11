SUMMARY = "GeoJSON <-> WKT/WKB conversion utilities"
DESCRIPTION = "GeoJSON <-> WKT/WKB conversion utilities"
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "python39-geomet-1.0.0-1.3.noarch.rpm"
RPM_HASH = "ab3ec2492951baf4afad2e26a2f06a53b3318ca3093c47036525fbfd5418d43c5f1a5165b029adb642de6fa7ff84bf3529ee3268670da6d241d25268227e8c20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-geomet \
python39-geomet \
python3dist-geomet"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-click \
update-alternatives"

inherit rpm
