SUMMARY = "Check incoming/outgoing transfer rates of a router"
DESCRIPTION = "This plugin will check the incoming/outgoing transfer rates of a router, \
switch, etc recorded in an MRTG log.  If the newest log entry is older \
than <expire_minutes>, a WARNING status is returned. If either the \
incoming or outgoing rates exceed the <icl> or <ocl> thresholds (in \
Bytes/sec), a CRITICAL status results.  If either of the rates exceed \
the <iwl> or <owl> thresholds (in Bytes/sec), a WARNING status results."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.3.1"

RPM_NAME = "monitoring-plugins-mrtgtraf-2.3.1-9.4.aarch64.rpm"
RPM_HASH = "3f8c00c5ca8f5e799f205a7bc833fb9c30814653f6a0e03e27cfd10d0eec81f3031ff5b1b3018db9034863a1202a3ad8cc8550a5f5f103061f54ee59ce2c8812"

RPROVIDES:${PN} += "monitoring-plugins-mrtgtraf \
monitoring-plugins-mrtgtraf(aarch-64) \
nagios-plugins-mrtgtraf"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
