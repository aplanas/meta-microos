SUMMARY = "Tool for generating C-based recognizers from regular expressions"
DESCRIPTION = "re2c is a tool for writing fast and flexible lexers. Unlike other such \
tools, it concentrates solely on generating efficient code for matching \
regular expressions. This makes it suitable for a wide variety of \
applications. The generated scanners approach hand-crafted ones in \
terms of size and speed."
LICENSE = "SUSE-Public-Domain"

PV = "3.1"

RPM_NAME = "re2c-3.1-1.1.aarch64.rpm"
RPM_HASH = "8ffb6939fee8a0ed19fb236aa356dbc21732361b8110f3c91ea49c8d15234293ff43474184eda9135d4eed499ab23e6fe642754405bdfd120e159c8f6996dfa1"

RPROVIDES:${PN} += "re2c"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
