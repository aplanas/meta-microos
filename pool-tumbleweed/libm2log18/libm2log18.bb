SUMMARY = "GNU Modula-2 compiler runtime library"
DESCRIPTION = "Runtime library for the GNU Modula-2 language."
LICENSE = "BSL-1.0"

PV = "13.1.1+git7364"

RPM_NAME = "libm2log18-13.1.1+git7364-1.1.aarch64.rpm"
RPM_HASH = "b797fc7b7aec963adcfc272da21f792ee2899b57f6c18f91ccbd5f9186b34ce26fe9a1182c4a3483908553cb9a0a52ede20c2b3ef551dde25fca953401f24ffc"

RPROVIDES:${PN} += "libm2log.so.18 \
libm2log18"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
