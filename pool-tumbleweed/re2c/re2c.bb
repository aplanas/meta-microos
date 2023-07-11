SUMMARY = "Tool for generating C-based recognizers from regular expressions"
DESCRIPTION = "re2c is a tool for writing fast and flexible lexers. Unlike other such \
tools, it concentrates solely on generating efficient code for matching \
regular expressions. This makes it suitable for a wide variety of \
applications. The generated scanners approach hand-crafted ones in \
terms of size and speed."
LICENSE = "SUSE-Public-Domain"

PV = "3.0"

RPM_NAME = "re2c-3.0-1.13.aarch64.rpm"
RPM_HASH = "0cbb14659dfbf9f148ca3110b67a64e31b6694bbf449e28f3a44179bce3fd06494069045a70fce3db07c9f4eafa3f03d5bed81172b41128a90cbb0bb015f1a85"

RPROVIDES:${PN} += "re2c"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
