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

RPM_NAME = "kured-1.10.2-1.4.aarch64.rpm"
RPM_HASH = "f61e9ae06133e5d0fb5984a3b1865eb8b7b2c6b57881f0bba65e6e2b7cb5b9bdc725c7bf2eea4fb2b17b89a33d612ed6dc9e30195621fb472747ab7245fa0bf2"

RPROVIDES:${PN} += "kured \
kured(aarch-64)"

RDEPENDS:${PN} += "libc.so.6()(64bit)"

inherit rpm
