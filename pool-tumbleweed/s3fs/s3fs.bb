SUMMARY = "FUSE file system backed by Amazon S3 bucket"
DESCRIPTION = "FUSE-based file system backed by Amazon S3. Mount a bucket as a local \
file system read/write. Store files/folders natively and transparently"
LICENSE = "GPL-2.0-or-later"

PV = "1.93"

RPM_NAME = "s3fs-1.93-1.1.aarch64.rpm"
RPM_HASH = "78b269a0818ce06b2ff8067adb27b249131a878ae133dc92fa46b8e7b0ad4ca6db3febf83f5582169a6b13092058c3a90f48079de691a62b8889940f22ea4531"

RPROVIDES:${PN} += "s3fs"

RDEPENDS:${PN} += "fuse \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libcurl.so.4 \
libfuse.so.2 \
libstdc++.so.6 \
libxml2.so.2"

inherit rpm
