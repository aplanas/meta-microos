SUMMARY = "Libmms development files"
DESCRIPTION = "Headers and libraries to program against libmms"
LICENSE = "LGPL-2.1+"

PV = "0.6.4"

RPM_NAME = "libmms-devel-0.6.4-5.27.aarch64.rpm"
RPM_HASH = "43da457ca5dfedd72bc9f7c60fc4ceef8e1febd67f5888c192e893cb1383a901d9df3a712da7c5bb3ce1e4a8f77e5aebe40af1c338a740fd7911e9cf30cf5d38"

RPROVIDES:${PN} += "libmms-devel \
pkgconfig-libmms"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libmms0"

inherit rpm
