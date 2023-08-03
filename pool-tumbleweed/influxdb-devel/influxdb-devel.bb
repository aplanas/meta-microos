SUMMARY = "InfluxDB development files"
DESCRIPTION = "Go sources and other development files for InfluxDB"
LICENSE = "MIT"

PV = "1.11.1"

RPM_NAME = "influxdb-devel-1.11.1-1.1.aarch64.rpm"
RPM_HASH = "89bc0975d023ebb544ee710706fabb0935c43fe0e4f28c144641e02b36a7eac1206bb20944ac9fac3f13e80afb2d277f97309c8c2a55e86dcae0428ae58ccb0b"

RPROVIDES:${PN} += "influxdb-devel"

RDEPENDS:${PN} += "go"

inherit rpm
