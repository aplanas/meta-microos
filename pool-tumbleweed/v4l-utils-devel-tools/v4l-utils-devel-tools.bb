SUMMARY = "Utilities for v4l2 / DVB driver development and debugging"
DESCRIPTION = "Utilities for v4l2 / DVB driver authors for development and debugging."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later"

PV = "1.24.1"

RPM_NAME = "v4l-utils-devel-tools-1.24.1-1.4.aarch64.rpm"
RPM_HASH = "ccc297c816ff46634b8d8a3f9b943c58792f4503df5d289f25ef959a7c395dae980644b069dce70fc12be7c9aeab09b076f96a1c164e8efc8589b8c60ec8ddbc"

RPROVIDES:${PN} += "v4l-utils-devel-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libv4l \
libv4l2.so.0"

inherit rpm
