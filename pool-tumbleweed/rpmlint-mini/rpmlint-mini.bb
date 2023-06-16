SUMMARY = "RPM file correctness checker"
DESCRIPTION = "rpmlint is a tool to check common errors on RPM packages. Binary and \
source packages can be checked."
LICENSE = "GPL-2.0-or-later"

PV = "2.4.0+git20230602.89901a92"

RPM_NAME = "rpmlint-mini-2.4.0+git20230602.89901a92-11.8.aarch64.rpm"
RPM_HASH = "a6a5b6bf9533ea574dd07d5817e9f305dcaed8460653eb86e480ed1f8e6a753219b61de89ae08d01189934fb3bcf68b68762d5bba75d65623aa3c16aea381dd4"

RPROVIDES:${PN} += "rpmlint-mini"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
cpio \
ld-linux-aarch64.so.1 \
polkit-default-privs"

inherit rpm
