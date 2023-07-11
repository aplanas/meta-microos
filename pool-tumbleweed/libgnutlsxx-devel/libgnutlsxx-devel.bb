SUMMARY = "Development package for the GnuTLS C++ API"
DESCRIPTION = "Files needed for software development using gnutls."
LICENSE = "LGPL-2.1-or-later"

PV = "3.8.0"

RPM_NAME = "libgnutlsxx-devel-3.8.0-4.2.aarch64.rpm"
RPM_HASH = "9c9e9074d44534f4bd35990588f8c325d1429824a86269b12855706516590f5ba492ade0fab24cf298b2f7b813ba615e327ff422352599549426b185214c3807"

RPROVIDES:${PN} += "libgnutlsxx-devel"

RDEPENDS:${PN} += "libgnutls-devel \
libgnutlsxx30 \
libstdc++-devel"

inherit rpm
