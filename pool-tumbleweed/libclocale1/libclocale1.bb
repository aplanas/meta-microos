SUMMARY = "Library for C locale functions"
DESCRIPTION = "A library for C locale functions."
LICENSE = "LGPL-3.0-or-later"

PV = "20221218"

RPM_NAME = "libclocale1-20221218-1.3.aarch64.rpm"
RPM_HASH = "a141a406d4cdd675388d4b304df116ef4c5220ead03c6078cce7bd0ea7311aeddd3ada97832caa769b1960f17bdee9d878722b2b0fd72dd415b5785b17c96a16"

RPROVIDES:${PN} += "libclocale.so.1 \
libclocale1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1"

inherit rpm
