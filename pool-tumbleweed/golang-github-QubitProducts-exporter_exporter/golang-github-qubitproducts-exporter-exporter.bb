SUMMARY = "Reverse proxy designed for Prometheus exporters"
DESCRIPTION = "Reverse proxy designed for Prometheus exporters"
LICENSE = "Apache-2.0"

PV = "0.4.0"

RPM_NAME = "golang-github-QubitProducts-exporter_exporter-0.4.0-10.6.aarch64.rpm"
RPM_HASH = "509ae930f3fb73f34267cd650e4e3cfa988a05fa09d784a84f88ababa00d44619c263a3e8ca948cdbf71bffb1040d67adae0db274730e570d3789342628f5f0d"

RPROVIDES:${PN} += "config-golang-github-QubitProducts-exporter-exporter \
golang-github-QubitProducts-exporter-exporter"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
shadow"

inherit rpm
