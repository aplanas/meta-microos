SUMMARY = "GNU Modula-2 compiler runtime library"
DESCRIPTION = "Runtime library for the GNU Modula-2 language."
LICENSE = "BSL-1.0"

PV = "13.2.1+git7683"

RPM_NAME = "libm2pim18-13.2.1+git7683-2.1.aarch64.rpm"
RPM_HASH = "df177a7450ee724cdc8c622194429ab9324b21b4a8c8f81892f394ec0ec78b3da621a6642e87a9966019749b795cf7b2de689aa2bc3382a53a08cd8205cbca1c"

RPROVIDES:${PN} += "libm2pim.so.18 \
libm2pim18"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
