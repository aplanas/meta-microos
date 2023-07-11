SUMMARY = "Squid Prometheus Exporter"
DESCRIPTION = "Exports squid metrics in Prometheus format"
LICENSE = "MIT"

PV = "1.6"

RPM_NAME = "golang-github-boynux-squid_exporter-1.6-4.4.aarch64.rpm"
RPM_HASH = "77e22802688ae0d5aa43ce68f9b837e37c6a165b83355ef7ed8c322ec0ba2d704d5e50750a155d1577fdeebc25fd199ee76a6199221ec0a65fbd80741fa01270"

RPROVIDES:${PN} += "golang-github-boynux-squid-exporter"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6 \
shadow \
systemd"

inherit rpm
