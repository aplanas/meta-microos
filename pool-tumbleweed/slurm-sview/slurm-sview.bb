SUMMARY = "SLURM graphical interface"
DESCRIPTION = "sview is a graphical user interface to get and update state information for \
jobs, partitions, and nodes managed by SLURM."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "23.02.4"

RPM_NAME = "slurm-sview-23.02.4-2.1.aarch64.rpm"
RPM_HASH = "01e1ccb406d1f44e11ae8631b00baeef07c7aab2ff1fd0b350174e4514d1aac963bf82c9f518556bbe58e6f23ac39ba2d9950f5f3ba9566393fd3cb1db8c81c3"

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
