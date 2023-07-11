SUMMARY = "Library to access the Windows Shell Item format"
DESCRIPTION = "Library to access the Windows Shell Item format for the libyal family of libraries. \
libyal is typically used in digital forensic tools."
LICENSE = "LGPL-3.0-or-later"

PV = "20230114"

RPM_NAME = "libfwsi1-20230114-1.7.aarch64.rpm"
RPM_HASH = "36e703923361cebc0ffb7235af3032b975de4aff7c4f819386a79b58eef87434b299b57515b9f297c391853a26d2c62e900a6b5851b8f5a0de20962eaf0341c5"

RPROVIDES:${PN} += "libfwsi.so.1 \
libfwsi1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcdata.so.1 \
libcerror.so.1 \
libcnotify.so.1 \
libuna.so.1"

inherit rpm
