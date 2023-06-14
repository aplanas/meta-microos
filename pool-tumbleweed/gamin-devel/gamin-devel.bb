SUMMARY = "Libraries and includes to build against gamin"
DESCRIPTION = "Libraries, includes, etc. to use and build against gamin."
LICENSE = "LGPL-2.1-only"

PV = "0.1.10"

RPM_NAME = "gamin-devel-0.1.10-18.1.aarch64.rpm"
RPM_HASH = "e7801d346e0aee380831b9f84d23ef9eaebbf3bd4001efd13db5921b4493c628907fe1f8a99418182aa834dbd0a01acf101c3cf6eb21c6da95168391611e54a8"

RPROVIDES:${PN} += "gamin-devel \
gamin-devel-static \
pkgconfig-gamin"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfam0-gamin \
libgamin-1-0"

inherit rpm
