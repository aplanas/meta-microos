SUMMARY = "An OCI container runtime monitor"
DESCRIPTION = "Conmon is a monitoring program and communication tool between a \
container manager (like podman or CRI-O) and an OCI runtime (like \
runc or crun) for a single container."
LICENSE = "Apache-2.0"

PV = "2.1.8"

RPM_NAME = "conmon-2.1.8-1.1.aarch64.rpm"
RPM_HASH = "a269f8d61186f60062483ba82a8300afc1fec85ac214f4ccbff87c5a156a19cdc4dc7ad74397080178dd0fb6bdb81caaaac26c25ceadb2483283cd605b90b3f2"

RPROVIDES:${PN} += "conmon"

RDEPENDS:${PN} += "libc.so.6 \
libglib-2.0.so.0 \
libsystemd.so.0"

inherit rpm
