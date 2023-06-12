SUMMARY = "Java API for collectd"
DESCRIPTION = "Optional collectd Java API in order to write collectd plugins in \
Java."
LICENSE = "GPL-2.0-only & MIT"

PV = "5.12.0.134.g4cebbfc"

RPM_NAME = "collectd-plugin-java-5.12.0.134.g4cebbfc-1.4.aarch64.rpm"
RPM_HASH = "dd53ecf093aaa6b152e368a6b8369c56ba27ef3ade45eb0fa66282d385070a139f9a3c1f310b4769d473a461bf57207d99d64d0f2c933380e3a7894bcf6954f4"

RPROVIDES:${PN} += "collectd-plugin-java \
collectd-plugin-java(aarch-64)"
RDEPENDS:${PN} += "collectd \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libjvm.so()(64bit) \
libjvm.so(SUNWprivate_1.1)(64bit)"

inherit rpm
