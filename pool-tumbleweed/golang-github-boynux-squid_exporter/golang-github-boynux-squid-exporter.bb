SUMMARY = "Squid Prometheus Exporter"
DESCRIPTION = "Exports squid metrics in Prometheus format"
LICENSE = "MIT"

PV = "1.6"

RPM_NAME = "golang-github-boynux-squid_exporter-1.6-4.3.aarch64.rpm"
RPM_HASH = "4ad60a2f1c826862a57241534d9df77c450e77a0676e84b093f44827ea6b0c76c58d238c036738888cbbed5f24cc0fc54a92036a98a6854af6be6ac2fa781b6b"

RPROVIDES:${PN} += "golang-github-boynux-squid_exporter \
golang-github-boynux-squid_exporter(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
libc.so.6()(64bit) \
shadow \
systemd"

inherit rpm
