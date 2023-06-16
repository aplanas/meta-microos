SUMMARY = "Scripts for handling YAST logs"
DESCRIPTION = "This package contains scripts for handling YAST logs."
LICENSE = "GPL-2.0-only"

PV = "4.6.2"

RPM_NAME = "yast2-logs-4.6.2-1.1.aarch64.rpm"
RPM_HASH = "3b694d9b4dd2fc367c2b08e39bc73da09eec7c6958c500fdff343c0ee087b82a12310ed88491812ed9227b0bc000d15a6f661af2bdb007a0ea7d82b6d30fce53"

RPROVIDES:${PN} += "yast2-/usr/sbin/save-y2logs \
yast2-logs"

RDEPENDS:${PN} += "/usr/bin/bash \
tar"

inherit rpm
