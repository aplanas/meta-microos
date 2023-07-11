SUMMARY = "Apache Exporter for Prometheus"
DESCRIPTION = "Exports apache mod_status statistics via HTTP for Prometheus consumption."
LICENSE = "MIT"

PV = "0.11.0"

RPM_NAME = "golang-github-lusitaniae-apache_exporter-0.11.0-5.4.aarch64.rpm"
RPM_HASH = "5d32aa0e5897cff93b2d339192d68f13d9e32268975f67189defe98bd6f0b4e03bdd4f2f1810c8696f95a4315c0df2fe8a6ab64031c0412b08be72e9fa567a1c"

RPROVIDES:${PN} += "config-golang-github-lusitaniae-apache-exporter \
golang-github-lusitaniae-apache-exporter"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6 \
shadow \
systemd"

inherit rpm
