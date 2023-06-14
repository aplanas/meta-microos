SUMMARY = "A tool to possibly recover deleted content on ext3 file systems"
DESCRIPTION = "A tool to investigate an ext3 file system for deleted content and possibly recover it. \
 \
Also see http://www.xs4all.nl/~carlo17/howto/undelete_ext3.html"
LICENSE = "GPL-2.0-only"

PV = "0.10.2"

RPM_NAME = "ext3grep-0.10.2-9.17.aarch64.rpm"
RPM_HASH = "b0046972df4104d0e6a2668c803815f4db2b2c4789ea3c448c05a4b62bd153995d68c89db136bd54ce242e20d6999630ef5231b285691b35769f736b8e9ec1b4"

RPROVIDES:${PN} += "ext3grep"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
