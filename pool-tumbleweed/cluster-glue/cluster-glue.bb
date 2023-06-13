SUMMARY = "Reusable cluster components"
DESCRIPTION = "A collection of common tools that are useful for writing cluster managers \
such as Pacemaker. \
Provides a local resource manager that understands the OCF and LSB \
standards, and an interface to common STONITH devices."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "1.0.12+v1.git.1663933145.1619d044"

RPM_NAME = "cluster-glue-1.0.12+v1.git.1663933145.1619d044-1.4.aarch64.rpm"
RPM_HASH = "3c1ba2a359a9d0089312c4ba1b1d5f3d1cc878ca8bfde8f96a8769f1044f37c5ae7ba5073b017c744411238109752454c033943f5c7d6567cb7b4266c4786202"

RPROVIDES:${PN} += "cluster-glue \
cluster-glue(aarch-64)"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/env \
/usr/bin/perl \
group(nobody) \
ld-linux-aarch64.so.1()(64bit) \
libbz2.so.1()(64bit) \
libc.so.6()(64bit) \
libcurl.so.4()(64bit) \
libglib-2.0.so.0()(64bit) \
libnetsnmp.so.40()(64bit) \
libpils.so.2()(64bit) \
libplumb.so.2()(64bit) \
libplumbgpl.so.2()(64bit) \
libstonith.so.1()(64bit) \
libxml2.so.2()(64bit) \
libz.so.1()(64bit) \
perl-TimeDate \
shadow \
sudo \
systemd \
user(nobody)"

inherit rpm
