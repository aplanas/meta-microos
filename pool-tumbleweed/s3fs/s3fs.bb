SUMMARY = "FUSE file system backed by Amazon S3 bucket"
DESCRIPTION = "FUSE-based file system backed by Amazon S3. Mount a bucket as a local \
file system read/write. Store files/folders natively and transparently"
LICENSE = "GPL-2.0-or-later"

PV = "1.92"

RPM_NAME = "s3fs-1.92-1.1.aarch64.rpm"
RPM_HASH = "ba5af40fe26dd5d3cbab47b5ed3288e719750fbdf9e5d1f0bff10e1b628972d604fff6280afd4a56d43cb5b429a19422f4e887adb42e7b3efc2af52199ac8d39"

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
