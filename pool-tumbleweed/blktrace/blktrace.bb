SUMMARY = "Block IO tracer"
DESCRIPTION = "blktrace is a block layer IO tracing mechanism which provides detailed \
information about request queue operations up to user space. This is \
valuable for diagnosing and fixing performance or application problems \
relating to block layer io."
LICENSE = "GPL-2.0-only"

PV = "1.3.0+git.20211021"

RPM_NAME = "blktrace-1.3.0+git.20211021-1.9.aarch64.rpm"
RPM_HASH = "202fba145a5c00c8fe522390edbf67f47751f0ec8603627e6a7a001a4b79734e85b7728d521652170f719744c5911cbfc6bc3ebf5559b23062c8289d070c94d2"

RPROVIDES:${PN} += "blktrace"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libaio.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
