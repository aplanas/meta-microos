SUMMARY = "FIFO interface used by startproc"
DESCRIPTION = "The libaray for the FIFO interface used by the LSB startproc command."
LICENSE = "GPL-2.0-or-later"

PV = "2.26"

RPM_NAME = "libblogger2-2.26-2.3.aarch64.rpm"
RPM_HASH = "0c206880036ca16a7e87ed67802ccd22cafd2c9d262c323fcb8f7a8710a1e7ca5b6b73493b8539b6852a893aeae920254282d8138e4088ee0be3ba62f656c4d8"

RPROVIDES:${PN} += "blog-/usr/lib64/libblogger.so.2 \
libblogger.so.2 \
libblogger2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
