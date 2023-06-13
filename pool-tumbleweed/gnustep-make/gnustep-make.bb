SUMMARY = "GNUstep Makefile package"
DESCRIPTION = "This package contains the basic scripts, makefiles and directory \
layout needed to run and compile any GNUstep software. This package \
was configured for the FHS file system layout, customised for SUSE."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "2.9.1"

RPM_NAME = "gnustep-make-2.9.1-2.1.aarch64.rpm"
RPM_HASH = "9427ca58a8823ab4fa0c9875e70e40b63697b1a18ccb8a09c962b3da6b7da9a1541ca73b57a9ac84c2cb32bd0c672215f2c39e4a5cf8d2973b750d0f393cfbf6"

RPROVIDES:${PN} += "config(gnustep-make) \
gnustep-make \
gnustep-make(aarch-64)"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/sbin/ldconfig \
/usr/bin/bash"

inherit rpm
