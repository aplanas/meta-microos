SUMMARY = "Kubernetes-native security toolkit"
DESCRIPTION = "Starboard integrates security tools into the Kubernetes environment, so that users can find and view the risks that relate to different resources in a Kubernetes-native way. Starboard provides custom resources definitions and a Go module to work with a range of existing security scanners, as well as a kubectl-compatible command, the Octant plugin, and the Lens extension that make security reports available through familiar Kubernetes tools."
LICENSE = "Apache-2.0"

PV = "0.15.12"

RPM_NAME = "starboard-0.15.12-1.2.aarch64.rpm"
RPM_HASH = "7934e7604165401958cfe2dafd26b67c87ce48a3444da0addce9428beccb546b740d6e6723247aa3c046ed0547caf22eb1ed56ac08f01c433a360637fd014499"

RPROVIDES:${PN} += "starboard \
starboard(aarch-64)"

RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
