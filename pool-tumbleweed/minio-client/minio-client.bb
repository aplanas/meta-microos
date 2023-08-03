SUMMARY = "Client for MinIO"
DESCRIPTION = "MinIO Client is a replacement for ls, cp, mkdir, diff and rsync commands for filesystems and object storage. \
 \
Please note: In contrast to upstream this package provides the executable as `minio-client`."
LICENSE = "AGPL-3.0-only"

PV = "20230721T204427Z"

RPM_NAME = "minio-client-20230721T204427Z-1.1.aarch64.rpm"
RPM_HASH = "60e80cc8fe2aeed4abdd3b02b9f21d8095091e135ba8af384fa99c01e60661c483d33e1c15feef32e30b8748c26c7549c4a3e71ecba976f3b34923c8b538346f"

RPROVIDES:${PN} += "minio-client"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
