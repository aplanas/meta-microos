SUMMARY = "Tool for generating C-based recognizers from regular expressions"
DESCRIPTION = "re2c is a tool for writing fast and flexible lexers. Unlike other such \
tools, it concentrates solely on generating efficient code for matching \
regular expressions. This makes it suitable for a wide variety of \
applications. The generated scanners approach hand-crafted ones in \
terms of size and speed."
LICENSE = "SUSE-Public-Domain"

PV = "3.0"

RPM_NAME = "re2c-3.0-1.10.aarch64.rpm"
RPM_HASH = "75a0b1296a07b58507951ef985df9e3eb27ae06fa51d7f44f209b05525416f4cfc4778a26e0fc04d94d4d029c2275e6bd9feed8087675bd77f8c878869bdf741"

RPROVIDES:${PN} += "re2c \
re2c(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
