SUMMARY = "GNU Modula-2 compiler runtime library"
DESCRIPTION = "Runtime library for the GNU Modula-2 language."
LICENSE = "BSL-1.0"

PV = "13.1.1+git7364"

RPM_NAME = "libm2min18-13.1.1+git7364-1.1.aarch64.rpm"
RPM_HASH = "1d7edf27723673561d9edf7dc7b8c463dad6bc69cf10ab7e24ba7c34363d7834caf8af691bf350f00c15e98d357dd2ee86c1af22d9edd27b96a52717e8a5af70"

RPROVIDES:${PN} += "libm2min.so.18()(64bit) \
libm2min18 \
libm2min18(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig"

inherit rpm
