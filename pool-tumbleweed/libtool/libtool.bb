SUMMARY = "A Tool to Build Shared Libraries"
DESCRIPTION = "GNU libtool is a set of shell scripts to automatically configure UNIX \
architectures to build shared libraries in a generic fashion."
LICENSE = "GFDL-1.2-or-later & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.4.7"

RPM_NAME = "libtool-2.4.7-3.3.aarch64.rpm"
RPM_HASH = "8c0b77f1ea1e5f6675019c8624f5ab1528c41e5117374594c32bcd106524d56e39afd3247b3b17494b8038c293d41f892defd4490780be63b29add8cf9ff4bef"

RPROVIDES:${PN} += "libltdl-devel \
libtool \
libtool-ltdl-devel"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/bash \
/usr/bin/env \
automake \
libltdl7 \
m4 \
tar"

inherit rpm
