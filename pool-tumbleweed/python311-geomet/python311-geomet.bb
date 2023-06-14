SUMMARY = "GeoJSON <-> WKT/WKB conversion utilities"
DESCRIPTION = "GeoJSON <-> WKT/WKB conversion utilities"
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "python311-geomet-1.0.0-1.1.noarch.rpm"
RPM_HASH = "9182ea72a5af7fa583135e74b4bafcb87a23a20289270666238d37b441c197907e50276764ed73e745b3cd5363a8754f7fea890fcaae014990e06bb186b60dcc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-geomet \
python311-geomet \
python3dist-geomet"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python-abi \
python311-click \
update-alternatives"

inherit rpm
