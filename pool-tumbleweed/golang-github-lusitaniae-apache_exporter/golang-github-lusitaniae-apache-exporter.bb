SUMMARY = "Apache Exporter for Prometheus"
DESCRIPTION = "Exports apache mod_status statistics via HTTP for Prometheus consumption."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "golang-github-lusitaniae-apache_exporter-1.0.0-3.1.aarch64.rpm"
RPM_HASH = "14fd4156c1e9415e1e1f29c83a177f298a69407e7e0dc3315e6213468ccdd0385febee79398058209c9b289b25b55e184138cd28fb7930e1acc3a17d2c262ddc"

RPROVIDES:${PN} += "config-golang-github-lusitaniae-apache-exporter \
golang-github-lusitaniae-apache-exporter"

RDEPENDS:${PN} += "/usr/bin/sh \
shadow"

inherit rpm
