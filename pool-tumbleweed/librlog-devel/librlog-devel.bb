SUMMARY = "Include Files and Libraries mandatory for Development"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "LGPL-2.1-or-later"

PV = "1.4"

RPM_NAME = "librlog-devel-1.4-19.5.aarch64.rpm"
RPM_HASH = "c13c42e708a5a8562f74f6383b9de74c2ec959e7bcae6f1e52c4e1d4d40856da0e53e34bb079d0caae5925bcc1f4d54c926cf25100509df296381b87ed4f33fa"

RPROVIDES:${PN} += "librlog-devel \
pkgconfig-librlog \
rlog-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
librlog5 \
libstdc++-devel"

inherit rpm
