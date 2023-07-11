SUMMARY = "An OCI container runtime monitor"
DESCRIPTION = "Conmon is a monitoring program and communication tool between a \
container manager (like podman or CRI-O) and an OCI runtime (like \
runc or crun) for a single container."
LICENSE = "Apache-2.0"

PV = "2.1.7"

RPM_NAME = "conmon-2.1.7-2.1.aarch64.rpm"
RPM_HASH = "e636fefe2bfec8483c7c366a97021bf967f94579a8bc60de661c1085850e9cba1862e7e1f7c52f9de18aeff7133b9c1f9d9feb3efbf9789790d0c95bad5f5ac6"

RPROVIDES:${PN} += "conmon"

RDEPENDS:${PN} += "libc.so.6 \
libglib-2.0.so.0 \
libsystemd.so.0"

inherit rpm
