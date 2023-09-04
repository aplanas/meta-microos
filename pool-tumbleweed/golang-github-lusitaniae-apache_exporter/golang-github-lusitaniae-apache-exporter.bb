SUMMARY = "Apache Exporter for Prometheus"
DESCRIPTION = "Exports apache mod_status statistics via HTTP for Prometheus consumption."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "golang-github-lusitaniae-apache_exporter-1.0.0-2.1.aarch64.rpm"
RPM_HASH = "5e7c8ed57d098177119681e46217088038441282b1e88d7096909cad94db3e827a4dee787ddf71ff91e93d2fe71e5604f0b8c316caaa93b478f2dc05ce6052af"

RPROVIDES:${PN} += "config-golang-github-lusitaniae-apache-exporter \
golang-github-lusitaniae-apache-exporter"

RDEPENDS:${PN} += "/usr/bin/sh \
shadow"

inherit rpm
