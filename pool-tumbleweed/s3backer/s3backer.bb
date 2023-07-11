SUMMARY = "FUSE and NBD single file backing store via Amazon S3"
DESCRIPTION = "s3backer is a filesystem that contains a single file backed by the Amazon \
Simple Storage Service (Amazon S3).  As a filesystem, it is very simple: \
it provides a single normal file having a fixed size.  Underneath, the \
file is divided up into blocks, and the content of each block is stored \
in a unique Amazon S3 object.  In other words, what s3backer provides is \
really more like an S3-backed virtual hard disk device, rather than a \
filesystem. \
 \
In typical usage, a `normal' filesystem is mounted on top of the file \
exported by the s3backer filesystem using a loopback mount (or disk image \
mount on Mac OS X). \
 \
s3backer can also function as a Network Block Device (NBD) plug-in."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.2"

RPM_NAME = "s3backer-2.0.2-2.5.aarch64.rpm"
RPM_HASH = "2221fced2321eca5c7d960f126f8f638431c0c7a83f4aa35e250fa42a4848d1cfa09400b0fd00192f715d46c51108ca22644c0071b83f70377315bec3bab645f"

RPROVIDES:${PN} += "s3backer"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libcurl.so.4 \
libexpat.so.1 \
libfuse.so.2 \
libz.so.1"

inherit rpm
