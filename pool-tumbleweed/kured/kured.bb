SUMMARY = "Kubernetes daemonset to perform safe automatic node reboots"
DESCRIPTION = "Kured (KUbernetes REboot Daemon) is a Kubernetes daemonset that \
performs safe automatic node reboots when the need to do so is \
indicated by the package management system of the underlying OS. \
 \
- Watches for the presence of a reboot sentinel e.g. /var/run/reboot-required \
 \
- Utilises a lock in the API server to ensure only one node reboots at a time \
 \
- Optionally defers reboots in the presence of active Prometheus alerts \
 \
- Cordons & drains worker nodes before reboot, uncordoning them after"
LICENSE = "Apache-2.0"

PV = "1.10.2"

RPM_NAME = "kured-1.10.2-1.5.aarch64.rpm"
RPM_HASH = "862762c4b9598ecde64ba5f6891d0279330e02f5820d78b63bd7e2934f2151dc5063a8a3af5f3b50ac8ec06c2c7b2974a9b327774881575a465b396a77d966ac"

RPROVIDES:${PN} += "kured"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
