SUMMARY = "RPM file correctness checker"
DESCRIPTION = "rpmlint is a tool to check common errors on RPM packages. Binary and \
source packages can be checked."
LICENSE = "GPL-2.0-or-later"

PV = "2.4.0+git20230602.89901a92"

RPM_NAME = "rpmlint-mini-2.4.0+git20230602.89901a92-11.15.aarch64.rpm"
RPM_HASH = "d10feabde9c0c18f048ecd1978f46006ddd6311d21dbe66f61e3496a6d359d42080f8f84321a85b476be9f2fd2aef267a052f55d4c57a39f6b5372bd24eaa1ee"

RPROVIDES:${PN} += "rpmlint-mini"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
cpio \
ld-linux-aarch64.so.1 \
polkit-default-privs"

inherit rpm
