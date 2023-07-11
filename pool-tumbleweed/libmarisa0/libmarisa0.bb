SUMMARY = "Matching Algorithm with Recursively Implemented StorAge"
DESCRIPTION = "The libmarisa0 package contains runtime libraries for marisa."
LICENSE = "LGPL-2.1-or-later | BSD-2-Clause"

PV = "0.2.6"

RPM_NAME = "libmarisa0-0.2.6-1.23.aarch64.rpm"
RPM_HASH = "dfa2ad0221de71af26fdf0d3d68d4d605a7fe3d1cc4c612ff41b354e23265e592bd1b3aaa7e1d7ca35f6ba7e6db77f8d145ac237b3b34f91339895ca01c7062c"

RPROVIDES:${PN} += "libmarisa.so.0 \
libmarisa0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
