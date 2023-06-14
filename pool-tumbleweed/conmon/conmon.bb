SUMMARY = "An OCI container runtime monitor"
DESCRIPTION = "Conmon is a monitoring program and communication tool between a \
container manager (like podman or CRI-O) and an OCI runtime (like \
runc or crun) for a single container."
LICENSE = "Apache-2.0"

PV = "2.1.7"

RPM_NAME = "conmon-2.1.7-1.3.aarch64.rpm"
RPM_HASH = "56a54f9b0658217160c1377150ee2621fcfa7b9508d0dfaebc777a0d6fac18da6fa8e37b798363a93998be6fb9ddefef26989e47f7f680916e79b43743289de0"

RPROVIDES:${PN} += "conmon"

RDEPENDS:${PN} += "libc.so.6 \
libglib-2.0.so.0 \
libsystemd.so.0"

inherit rpm
