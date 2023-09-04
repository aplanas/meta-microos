SUMMARY = "Client for MinIO"
DESCRIPTION = "MinIO Client is a replacement for ls, cp, mkdir, diff and rsync commands for filesystems and object storage. \
 \
Please note: In contrast to upstream this package provides the executable as `minio-client`."
LICENSE = "AGPL-3.0-only"

PV = "20230801T233057Z"

RPM_NAME = "minio-client-20230801T233057Z-1.1.aarch64.rpm"
RPM_HASH = "59708de38cd85b1adb658825a09c0e57d9026d334554bc7ac438c47ca6dc113c30640098737a6c50efcc66613046e524a364823aecd5cb01ec074c08858bb9f8"

RPROVIDES:${PN} += "minio-client"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
