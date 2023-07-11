SUMMARY = "Check incoming/outgoing transfer rates of a router"
DESCRIPTION = "This plugin will check the incoming/outgoing transfer rates of a router, \
switch, etc recorded in an MRTG log.  If the newest log entry is older \
than <expire_minutes>, a WARNING status is returned. If either the \
incoming or outgoing rates exceed the <icl> or <ocl> thresholds (in \
Bytes/sec), a CRITICAL status results.  If either of the rates exceed \
the <iwl> or <owl> thresholds (in Bytes/sec), a WARNING status results."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.3.1"

RPM_NAME = "monitoring-plugins-mrtgtraf-2.3.1-9.5.aarch64.rpm"
RPM_HASH = "af736fa12f3bf35a1da7f2876b50810e56f0405ab51b0de0dc3bf99901a0f023debf7f98366af51e8508a3e54b877afa2d0896e28dfe42fa2c2ebdf9d13c1e3d"

RPROVIDES:${PN} += "monitoring-plugins-mrtgtraf \
nagios-plugins-mrtgtraf"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
