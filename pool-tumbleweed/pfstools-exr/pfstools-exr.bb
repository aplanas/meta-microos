SUMMARY = "EXR file import and export for PFS tools"
DESCRIPTION = "This package contains two-way conversion filters between the EXR file \
format and pfstools's HDR graphics file format."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.2.0"

RPM_NAME = "pfstools-exr-2.2.0-3.14.aarch64.rpm"
RPM_HASH = "7c8a1bbc73140bb2a4ac150ce53d97c60b7a4f716bbd93d9b81056138bad905fdb1692e746e481ccd8e8b84cfffa80c2cc23c89975211ef9900d89476f4eb86c"

RPROVIDES:${PN} += "pfstools-exr"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libOpenEXR-3-1.so.30 \
libc.so.6 \
libgcc-s.so.1 \
libpfs.so.2 \
libstdc++.so.6"

inherit rpm
