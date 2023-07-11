SUMMARY = "Client for MinIO"
DESCRIPTION = "MinIO Client is a replacement for ls, cp, mkdir, diff and rsync commands for filesystems and object storage. \
 \
Please note: In contrast to upstream this package provides the executable as `minio-client`."
LICENSE = "AGPL-3.0-only"

PV = "20230628T215417Z"

RPM_NAME = "minio-client-20230628T215417Z-1.1.aarch64.rpm"
RPM_HASH = "5b623ecc1618089058105e851c86c25233b97fdfda6e6c07784d9aebe809d4da894d64f3ab46892839330fa78857ebdc4e7b9ca887c94db6a60e1237fef2d2de"

RPROVIDES:${PN} += "minio-client"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
