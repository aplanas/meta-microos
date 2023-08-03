SUMMARY = "RPM file correctness checker"
DESCRIPTION = "rpmlint is a tool to check common errors on RPM packages. Binary and \
source packages can be checked."
LICENSE = "GPL-2.0-or-later"

PV = "2.4.0+git20230727.0fd5122"

RPM_NAME = "rpmlint-mini-2.4.0+git20230727.0fd5122-12.3.aarch64.rpm"
RPM_HASH = "98a90b5aa7e650ed14c5ca6c33163233df1a461eb94bd7f2199970edcccf588aeca3222b2adb0bc9b77ac6c52da031eac392ebbdb3cb76672bc75004db9804f3"

RPROVIDES:${PN} += "rpmlint-mini"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
cpio \
ld-linux-aarch64.so.1 \
polkit-default-privs"

inherit rpm
