SUMMARY = "Development package for libkleo"
DESCRIPTION = "The development package for the libkleo libraries."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "libkleo-devel-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "8d05b117859b532e07a128730953c21e155942e55201c1432acb69ff350b6d4562a253f84701973085374ee23697bda230c22ad7a627e50ee76cd546b0f21d81"

RPROVIDES:${PN} += "cmake-KF5Libkleo \
cmake-KPim5Libkleo \
libkleo-devel"

RDEPENDS:${PN} += "cmake-QGpgme \
libKPim5libkleo5 \
libgpgmepp-devel"

inherit rpm
