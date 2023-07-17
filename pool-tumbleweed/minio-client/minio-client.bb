SUMMARY = "Client for MinIO"
DESCRIPTION = "MinIO Client is a replacement for ls, cp, mkdir, diff and rsync commands for filesystems and object storage. \
 \
Please note: In contrast to upstream this package provides the executable as `minio-client`."
LICENSE = "AGPL-3.0-only"

PV = "20230711T233044Z"

RPM_NAME = "minio-client-20230711T233044Z-1.1.aarch64.rpm"
RPM_HASH = "24ab8997f2b3110f43e8306b01df5ab48fd31918eb3e6aed72aac87df0e96292e234b79bc5d13eb527353a1d3387981c943a451960e903d5c42c58465ed7c927"

RPROVIDES:${PN} += "minio-client"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
