SUMMARY = "The Corosync Cluster Engine library"
DESCRIPTION = "This package contains the central Corosync library."
LICENSE = "BSD-3-Clause"

PV = "2.4.6"

RPM_NAME = "libcorosync_common4-2.4.6-1.4.aarch64.rpm"
RPM_HASH = "16ccb62f9d75b0bd17527b4e1167b3c0eef0f89be02cbfd1af1808a724aa76b05f52391261f5cf67aebc1206155e7ccbae5fb41d80c43fc13b0a709f5bad5ff9"

RPROVIDES:${PN} += "libcorosync-common.so.4 \
libcorosync-common4 \
libcorosync4"

RDEPENDS:${PN} += "/sbin/ldconfig"

inherit rpm
