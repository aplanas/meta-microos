SUMMARY = "Reverse proxy designed for Prometheus exporters"
DESCRIPTION = "Reverse proxy designed for Prometheus exporters"
LICENSE = "Apache-2.0"

PV = "0.4.0"

RPM_NAME = "golang-github-QubitProducts-exporter_exporter-0.4.0-10.5.aarch64.rpm"
RPM_HASH = "b1677d5e1fbc522f8aae630c0f2ccc1beb284b9938907a1768045e6819452ffd305b91cda9e71a76c3a339265e2bfbea2ee37300a7af8dabce1d507a63e37dd5"

RPROVIDES:${PN} += "config-golang-github-QubitProducts-exporter-exporter \
golang-github-QubitProducts-exporter-exporter"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
shadow"

inherit rpm
