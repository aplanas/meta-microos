SUMMARY = "The 'friendly interactive shell'"
DESCRIPTION = "fish is a command line shell. \
It is geared towards interactive use and its features are focused on user \
friendlieness and discoverability. The language syntax is simple but \
incompatible with other shell languages."
LICENSE = "GPL-2.0-only"

PV = "3.6.1"

RPM_NAME = "fish-3.6.1-1.2.aarch64.rpm"
RPM_HASH = "6d9f4f13c22ebb7ed46be4d33413ed06d883d5825e742d52aeccb43c97a276175d950e8c85e91f97f1ae78d32f988805ec4c743f0e1e63c5993e047b096dfd49"

RPROVIDES:${PN} += "config-fish \
fish"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
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
