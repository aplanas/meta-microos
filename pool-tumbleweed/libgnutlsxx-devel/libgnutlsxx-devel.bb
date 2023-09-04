SUMMARY = "Development package for the GnuTLS C++ API"
DESCRIPTION = "Files needed for software development using gnutls."
LICENSE = "LGPL-2.1-or-later"

PV = "3.8.1"

RPM_NAME = "libgnutlsxx-devel-3.8.1-1.1.aarch64.rpm"
RPM_HASH = "c8bf5aa0650faa00a3f04cce0d7454f589305d23a580e22abafefb03b247c6a234beb0d5f41985dd6c6fab8568e4c299ec401d4f1a2a150becee96be46831d23"

RPROVIDES:${PN} += "libgnutlsxx-devel"

RDEPENDS:${PN} += "libgnutls-devel \
libgnutlsxx30 \
libstdc++-devel"

inherit rpm
