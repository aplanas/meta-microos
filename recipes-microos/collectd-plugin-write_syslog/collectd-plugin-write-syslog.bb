SUMMARY = "Write Syslog plugin for collectd"
DESCRIPTION = "Optional collectd plugin to write values lists as syslog messages."
LICENSE = "GPL-2.0-only & MIT"

PV = "5.12.0.134.g4cebbfc"

RPM_NAME = "collectd-plugin-write_syslog-5.12.0.134.g4cebbfc-1.4.aarch64.rpm"
RPM_HASH = "5ce6ccd254c001f266b91ae7c17837a7aad7ea2f4f499e0430a6aa7247b97016ba2dbded4f9acd8660e9c69a52addbe0e82574828317ce6b67850821ead93652"

RPROVIDES:${PN} += "collectd-plugin-write_syslog collectd-plugin-write_syslog(aarch-64)"
RDEPENDS:${PN} += "collectd ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
