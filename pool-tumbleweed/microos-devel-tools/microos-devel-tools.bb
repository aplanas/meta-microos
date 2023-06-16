SUMMARY = "Tools to develop MicroOS"
DESCRIPTION = "This package contains tools to make developing of MicroOS easier."
LICENSE = "GPL-2.0-or-later"

PV = "2.21+git0"

RPM_NAME = "microos-devel-tools-2.21+git0-1.1.aarch64.rpm"
RPM_HASH = "7a4bc9c09fa8eb042821023ce45e8019418c1a0580eede598a6ef5af04c6146ba2bbe310e23b19c7122898276a900b8d8eef06a73864a25199336178ec20f39b"

RPROVIDES:${PN} += "microos-devel-tools"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
librpm.so.9"

inherit rpm
