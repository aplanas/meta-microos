SUMMARY = "GNU Modula-2 compiler runtime library"
DESCRIPTION = "Runtime library for the GNU Modula-2 language."
LICENSE = "BSL-1.0"

PV = "13.2.1+git7683"

RPM_NAME = "libm2min18-13.2.1+git7683-1.1.aarch64.rpm"
RPM_HASH = "57d81f720b07bcf61f97c37f80bff7794a3887bdfb1c76bcc3354f1808e8740e4b445baf79887d9e0da94cccd3baa1b09ed5a18e6b500bc9e32ca94a8615e104"

RPROVIDES:${PN} += "libm2min.so.18 \
libm2min18"

RDEPENDS:${PN} += "/sbin/ldconfig"

inherit rpm
