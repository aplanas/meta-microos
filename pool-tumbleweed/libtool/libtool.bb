SUMMARY = "A Tool to Build Shared Libraries"
DESCRIPTION = "GNU libtool is a set of shell scripts to automatically configure UNIX \
architectures to build shared libraries in a generic fashion."
LICENSE = "GFDL-1.2-or-later & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.4.7"

RPM_NAME = "libtool-2.4.7-3.4.aarch64.rpm"
RPM_HASH = "13ca7f220114d1cac0914ab98f71013cffd2a3f10f0a89edd6065cda25acbec7516c8120a091d459a0ed27acee866ec3050a847e5e416d932189d1a768189d7e"

RPROVIDES:${PN} += "libltdl-devel \
libtool \
libtool-ltdl-devel"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/env \
/usr/bin/sh \
automake \
libltdl7 \
m4 \
tar"

inherit rpm
