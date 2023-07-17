SUMMARY = "GNU Modula-2 compiler runtime library"
DESCRIPTION = "Runtime library for the GNU Modula-2 language."
LICENSE = "BSL-1.0"

PV = "13.1.1+git7552"

RPM_NAME = "libm2log18-13.1.1+git7552-1.1.aarch64.rpm"
RPM_HASH = "0fada4871adadfdb401f17f0395b6c64b8c86741d49092024266d7ce79973e5bc9b89c093b3532e9b2b884cd76c929623b7360af0d97ad2bb728569870b0ff97"

RPROVIDES:${PN} += "libm2log.so.18 \
libm2log18"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
