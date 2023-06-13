SUMMARY = "Development package for libksieve"
DESCRIPTION = "This package contains development headers of libksieve."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "libksieve-devel-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "6f047bc0fc66b0f5f096d0df7ae72bdf8ba68d6bc92afeb137f0b661504b1678318e8427b0c0163cd899598dbc55000af04c6658bd64def58a32639c5c1c296f"

RPROVIDES:${PN} += "cmake(KF5LibKSieve) \
cmake(KPim5LibKSieve) \
libksieve-devel \
libksieve-devel(aarch-64)"

RDEPENDS:${PN} += "libksieve5"

inherit rpm
