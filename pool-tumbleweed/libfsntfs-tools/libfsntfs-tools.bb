SUMMARY = "Tools to access the New Technology File System (NTFS)"
DESCRIPTION = "libfsntfs-tools is a project to access the NTFS filesystem \
 \
Note that this project currently only focuses on the analysis of the format."
LICENSE = "LGPL-3.0-or-later"

PV = "20230427"

RPM_NAME = "libfsntfs-tools-20230427-1.1.aarch64.rpm"
RPM_HASH = "d9acd21d51e618805f89bf3a80bb3744d34f4d67e45af16da7d55fd374e7e4ffb7f9168395a85d401900ac2ad87e5821750163e699b2f20a36a182e6b6083fdd"

RPROVIDES:${PN} += "libfsntfs-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libfdatetime.so.1 \
libfguid.so.1 \
libfsntfs.so.1 \
libfuse.so.2 \
libfusn.so.1 \
libfwnt.so.1 \
libhmac.so.1 \
libuna.so.1"

inherit rpm
