SUMMARY = "GNU Modula-2 compiler runtime library"
DESCRIPTION = "Runtime library for the GNU Modula-2 language."
LICENSE = "BSL-1.0"

PV = "13.1.1+git7552"

RPM_NAME = "libm2min18-13.1.1+git7552-1.1.aarch64.rpm"
RPM_HASH = "9cef626aa643397b5e506559c25018758e3f0119a0187640f041bdcd023e0f42f39351eb32cc40282ae3eb3f81cddf070d5453345016e6cd00d4e49f9b3834ea"

RPROVIDES:${PN} += "libm2min.so.18 \
libm2min18"

RDEPENDS:${PN} += "/sbin/ldconfig"

inherit rpm
