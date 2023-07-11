SUMMARY = "Sigrok Monitoring Plugin for collectd"
DESCRIPTION = "Optional collectd plugin to collect measurements from \
various devices supported by libsigrok."
LICENSE = "GPL-2.0-only & MIT"

PV = "5.12.0.134.g4cebbfc"

RPM_NAME = "collectd-plugin-sigrok-5.12.0.134.g4cebbfc-1.6.aarch64.rpm"
RPM_HASH = "cfa1c6e7f09000d66161d5781b5b0108d3f933e9e2a1858fa2dde96f18ad5e6f53e809eb6eaab4b7816c17306cdf2b92c319a24ce80ae2ecc30687c438d49899"

RPROVIDES:${PN} += "collectd-plugin-sigrok"

RDEPENDS:${PN} += "collectd \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libsigrok.so.4"

inherit rpm
