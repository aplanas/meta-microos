SUMMARY = "GNU Modula-2 compiler runtime library"
DESCRIPTION = "Runtime library for the GNU Modula-2 language."
LICENSE = "BSL-1.0"

PV = "13.1.1+git7597"

RPM_NAME = "libm2min18-13.1.1+git7597-1.1.aarch64.rpm"
RPM_HASH = "09366772758537ee1ec232d79ab782316c056958627bf10518809a0555e56434664d6b20f68f6ea1d05057c2047cd5aefdbfe9f79cb830c1dcb8d9e64aa218c9"

RPROVIDES:${PN} += "libm2min.so.18 \
libm2min18"

RDEPENDS:${PN} += "/sbin/ldconfig"

inherit rpm
