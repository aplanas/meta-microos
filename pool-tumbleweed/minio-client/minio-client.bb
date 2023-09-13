SUMMARY = "Client for MinIO"
DESCRIPTION = "MinIO Client is a replacement for ls, cp, mkdir, diff and rsync commands for filesystems and object storage. \
 \
Please note: In contrast to upstream this package provides the executable as `minio-client`."
LICENSE = "AGPL-3.0-only"

PV = "20230907T224855Z"

RPM_NAME = "minio-client-20230907T224855Z-1.1.aarch64.rpm"
RPM_HASH = "e371b509f636ebc69cd20f7b854f860ac87b74088386207612ca2b23c8013411c4d5f1860292f141bd880f0dc9338d6c1d1391cc5f2bbea8bf0963340bc7d993"

RPROVIDES:${PN} += "minio-client"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
