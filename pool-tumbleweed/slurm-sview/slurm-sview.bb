SUMMARY = "SLURM graphical interface"
DESCRIPTION = "sview is a graphical user interface to get and update state information for \
jobs, partitions, and nodes managed by SLURM."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "23.02.2"

RPM_NAME = "slurm-sview-23.02.2-1.1.aarch64.rpm"
RPM_HASH = "b5ae3050327ce5d687253ffd464e2ad33a7161776f270c4e6d5cebcd039b0048b5a907cbc3ad21142f9e9eda08c8d912449e2ce75fc457042ce1ca88c5b12b16"

RPROVIDES:${PN} += "slurm-sview \
slurm-sview(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgdk-x11-2.0.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-x11-2.0.so.0()(64bit) \
libslurmfull.so()(64bit)"

inherit rpm
