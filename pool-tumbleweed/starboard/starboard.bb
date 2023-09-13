SUMMARY = "Kubernetes-native security toolkit"
DESCRIPTION = "Starboard integrates security tools into the Kubernetes environment, so that users can find and view the risks that relate to different resources in a Kubernetes-native way. Starboard provides custom resources definitions and a Go module to work with a range of existing security scanners, as well as a kubectl-compatible command, the Octant plugin, and the Lens extension that make security reports available through familiar Kubernetes tools."
LICENSE = "Apache-2.0"

PV = "0.15.15"

RPM_NAME = "starboard-0.15.15-1.1.aarch64.rpm"
RPM_HASH = "5d014bf7a24e7318199f696b25b2bce858809f07f20667ba66f53c55a61b8ba694ce5b9f254bd4b60cf2badecfa3ede156994de65eeb77b7394d903ad85563fe"

RPROVIDES:${PN} += "starboard"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
