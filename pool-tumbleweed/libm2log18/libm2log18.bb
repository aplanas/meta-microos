SUMMARY = "GNU Modula-2 compiler runtime library"
DESCRIPTION = "Runtime library for the GNU Modula-2 language."
LICENSE = "BSL-1.0"

PV = "13.1.1+git7364"

RPM_NAME = "libm2log18-13.1.1+git7364-1.2.aarch64.rpm"
RPM_HASH = "5383c11c25736e6520407021d6a1c30cad774e6532a52915f609395bd7734e6220b415808d75d36cb7be8c011532148a37ccdc4d67a100b167bcedb7315c5cfe"

RPROVIDES:${PN} += "libm2log.so.18 \
libm2log18"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
