SUMMARY = "SLURM graphical interface"
DESCRIPTION = "sview is a graphical user interface to get and update state information for \
jobs, partitions, and nodes managed by SLURM."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "23.02.2"

RPM_NAME = "slurm-sview-23.02.2-1.4.aarch64.rpm"
RPM_HASH = "26c26509b546886b56e5d2acc86b8d26a897f7d28ef6ce8ea587b023da1449b9be108bbe93cdf9b00a3f5e555e88e99083114e6f882407e668de10ada2456b27"

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
