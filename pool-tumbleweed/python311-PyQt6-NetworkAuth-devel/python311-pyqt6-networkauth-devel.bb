SUMMARY = "Devel files for python311-PyQt6-NetworkAuth"
DESCRIPTION = "This package provides Qt6 API files for the Eric IDE and the SIP files \
used to generate the Python bindings for python311-PyQt6-NetworkAuth"
LICENSE = "GPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "python311-PyQt6-NetworkAuth-devel-6.5.0-1.2.aarch64.rpm"
RPM_HASH = "2eef4b992940b7217ed579b09b260023beda01e4ed4fe89f15d3cf0a9a24fe703564f85490c0925065f437bd79ac9cf4d8bb9f5f76f9cb7b760145824909bed9"

RPROVIDES:${PN} += "python3-PyQt6-NetworkAuth-devel \
python311-PyQt6-NetworkAuth-devel"

RDEPENDS:${PN} += "python311-PyQt6-devel"

inherit rpm
