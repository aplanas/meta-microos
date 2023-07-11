SUMMARY = "Logparser plugin for collectd"
DESCRIPTION = "Optional collectd plugin for filtering and parsing logs."
LICENSE = "GPL-2.0-only & MIT"

PV = "5.12.0.134.g4cebbfc"

RPM_NAME = "collectd-plugin-logparser-5.12.0.134.g4cebbfc-1.6.aarch64.rpm"
RPM_HASH = "a1e4f3197df1051a1cb21d4c3bff6baf54455e27e60d58806b895e693bd8ae7b3e406e6ec7c4b716f9247b60fbc8a0cffbfadb8dd5c2fee980abbb99d307e40d"

RPROVIDES:${PN} += "collectd-plugin-logparser"

RDEPENDS:${PN} += "collectd \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
