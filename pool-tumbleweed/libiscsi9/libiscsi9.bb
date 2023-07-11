SUMMARY = "iSCSI client library and utilities"
DESCRIPTION = "libiscsi is a clientside library to implement the iSCSI protocol \
that can be used to access resource of an iSCSI target. \
 \
The library is fully asynchronous with regards to iSCSI commands and \
SCSI tasks, but a synchronous layer is also provided for ease of use \
for simpler applications."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "1.19.0+git.20230208"

RPM_NAME = "libiscsi9-1.19.0+git.20230208-1.4.aarch64.rpm"
RPM_HASH = "27f91d48b42574981563fab204a375917662d949804f320321b4af13024605a41e18280695e9a5ccc3bed9caea3d11f35d4a1c5b0643d8dee2143fe878f9f823"

RPROVIDES:${PN} += "libiscsi.so.9 \
libiscsi9"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcrypt.so.20 \
libibverbs.so.1 \
librdmacm.so.1"

inherit rpm
