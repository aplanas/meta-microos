SUMMARY = "Reusable cluster components"
DESCRIPTION = "A collection of common tools that are useful for writing cluster managers \
such as Pacemaker. \
Provides a local resource manager that understands the OCF and LSB \
standards, and an interface to common STONITH devices."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "1.0.12+v1.git.1663933145.1619d044"

RPM_NAME = "cluster-glue-1.0.12+v1.git.1663933145.1619d044-1.5.aarch64.rpm"
RPM_HASH = "0d14805cfeaa3997bf8f0f9aaf2f68f5fb2fc7a5bc4799b64e86129767e82813a60e90ff4c1c512b532de879aef2fdb1ffc5e7cd3aa208481b829db936c13fb5"

RPROVIDES:${PN} += "cluster-glue"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/env \
/usr/bin/perl \
/usr/bin/sh \
group-nobody \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libcurl.so.4 \
libglib-2.0.so.0 \
libnetsnmp.so.40 \
libpils.so.2 \
libplumb.so.2 \
libplumbgpl.so.2 \
libstonith.so.1 \
libxml2.so.2 \
libz.so.1 \
perl-TimeDate \
shadow \
sudo \
systemd \
user-nobody"

inherit rpm
