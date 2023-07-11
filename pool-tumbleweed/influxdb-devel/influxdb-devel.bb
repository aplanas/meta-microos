SUMMARY = "InfluxDB development files"
DESCRIPTION = "Go sources and other development files for InfluxDB"
LICENSE = "MIT"

PV = "1.11.0"

RPM_NAME = "influxdb-devel-1.11.0-1.3.aarch64.rpm"
RPM_HASH = "23b3e2cbba1a040264af2811da28e79d9c79063cf753b2b2b536412b0e247ebe4d91b5b5c14008ce543e4b59e401f313d2747ce373d3559c1323699e7aeadf2d"

RPROVIDES:${PN} += "influxdb-devel"

RDEPENDS:${PN} += "go"

inherit rpm
