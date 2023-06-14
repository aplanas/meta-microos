SUMMARY = "The 'friendly interactive shell'"
DESCRIPTION = "fish is a command line shell. \
It is geared towards interactive use and its features are focused on user \
friendlieness and discoverability. The language syntax is simple but \
incompatible with other shell languages."
LICENSE = "GPL-2.0-only"

PV = "3.6.1"

RPM_NAME = "fish-3.6.1-1.1.aarch64.rpm"
RPM_HASH = "a0454aeea225e6b675695c91939f3c0eafc532c66f81f94191800cc9f848055ad09f5f0e9206d507aafdf4a942627c8601902e4a2b70117e56870e84e8d56944"

RPROVIDES:${PN} += "config-fish \
fish"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3 \
bc \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libpcre2-32.so.0 \
libstdc++.so.6 \
libtinfo.so.6 \
man"

inherit rpm
