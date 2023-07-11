SUMMARY = "Kubernetes-native security toolkit"
DESCRIPTION = "Starboard integrates security tools into the Kubernetes environment, so that users can find and view the risks that relate to different resources in a Kubernetes-native way. Starboard provides custom resources definitions and a Go module to work with a range of existing security scanners, as well as a kubectl-compatible command, the Octant plugin, and the Lens extension that make security reports available through familiar Kubernetes tools."
LICENSE = "Apache-2.0"

PV = "0.15.13"

RPM_NAME = "starboard-0.15.13-1.1.aarch64.rpm"
RPM_HASH = "6cac4c5c16f6af6809cd1f19a19c6a671b46cf0a1f8a970ba028536b9577a51125e6a4680ae103c248d84b5ed53a2ab21f6d428c49c7a94ac79027bb1c83fe35"

RPROVIDES:${PN} += "starboard"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
