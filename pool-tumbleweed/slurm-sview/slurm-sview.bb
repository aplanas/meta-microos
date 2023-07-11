SUMMARY = "SLURM graphical interface"
DESCRIPTION = "sview is a graphical user interface to get and update state information for \
jobs, partitions, and nodes managed by SLURM."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "23.02.2"

RPM_NAME = "slurm-sview-23.02.2-1.3.aarch64.rpm"
RPM_HASH = "75d4bb65afbc0c5bdb623d50ca13536a5120d61af4b70e847c1fb6d93aef233d5b20b772885a7113932ed7d4777843c79317f6f112099a00fa332e88de0c192c"

RPROVIDES:${PN} += "slurm-sview"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libslurmfull.so"

inherit rpm
