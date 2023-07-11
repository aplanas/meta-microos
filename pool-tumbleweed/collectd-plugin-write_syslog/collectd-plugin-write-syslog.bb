SUMMARY = "Write Syslog plugin for collectd"
DESCRIPTION = "Optional collectd plugin to write values lists as syslog messages."
LICENSE = "GPL-2.0-only & MIT"

PV = "5.12.0.134.g4cebbfc"

RPM_NAME = "collectd-plugin-write_syslog-5.12.0.134.g4cebbfc-1.6.aarch64.rpm"
RPM_HASH = "c8373a214a27b84bca690f7194e9ed584bb201148a73249da94f7a6baf2c4c0fb639a4ceb4999cb3886b5c586c11bb608702a769b4b825f0d95e71bb6575c7a3"

RPROVIDES:${PN} += "collectd-plugin-write-syslog"

RDEPENDS:${PN} += "collectd \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
