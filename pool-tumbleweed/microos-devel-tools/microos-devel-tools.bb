SUMMARY = "Tools to develop MicroOS"
DESCRIPTION = "This package contains tools to make developing of MicroOS easier."
LICENSE = "GPL-2.0-or-later"

PV = "2.21+git0"

RPM_NAME = "microos-devel-tools-2.21+git0-2.1.aarch64.rpm"
RPM_HASH = "c0824b7a0530ca047380bb95d49f43b21aa795d7f5ac861d9efac8cbc421b80bfb4084db0c430de7c337708608efd5f05fbfd78ef1d7eb1fcf7705521ea05547"

RPROVIDES:${PN} += "microos-devel-tools"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
librpm.so.9"

inherit rpm
