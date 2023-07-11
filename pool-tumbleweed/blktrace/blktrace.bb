SUMMARY = "Block IO tracer"
DESCRIPTION = "blktrace is a block layer IO tracing mechanism which provides detailed \
information about request queue operations up to user space. This is \
valuable for diagnosing and fixing performance or application problems \
relating to block layer io."
LICENSE = "GPL-2.0-only"

PV = "1.3.0+git.20211021"

RPM_NAME = "blktrace-1.3.0+git.20211021-1.10.aarch64.rpm"
RPM_HASH = "0ef0d15a10c121f500f0c1ea0d179d2014274131a1868ea68ba0bfb05fabfe6110228b0b7ca09795c59e6c1dbe599b1e122bb2db41ae85323c5ac67fed3e3821"

RPROVIDES:${PN} += "blktrace"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libaio.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
