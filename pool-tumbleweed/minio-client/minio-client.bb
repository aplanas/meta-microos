SUMMARY = "Client for MinIO"
DESCRIPTION = "MinIO Client is a replacement for ls, cp, mkdir, diff and rsync commands for filesystems and object storage. \
 \
Please note: In contrast to upstream this package provides the executable as `minio-client`."
LICENSE = "AGPL-3.0-only"

PV = "20230718T210538Z"

RPM_NAME = "minio-client-20230718T210538Z-1.1.aarch64.rpm"
RPM_HASH = "02901b8673a84ca799e2ec3c617deb1e47884564c4ab07c8e1093fba3d24af2012b2c4bfd47496ce39ebabd6752ffdbad29d418105a2dba706dd372c95f5a9ee"

RPROVIDES:${PN} += "minio-client"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
