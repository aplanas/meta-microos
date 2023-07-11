SUMMARY = "Libraries for foreign function call interfaces"
DESCRIPTION = "A library for building foreign function call interfaces in embedded \
interpreters."
LICENSE = "GPL-2.0-or-later"

PV = "2.4"

RPM_NAME = "libffcall0-2.4-2.8.aarch64.rpm"
RPM_HASH = "5b451cb1acbea565fcb51cfaad9d040e43016e6883f7c3332d4da351c3fe4f7ddf1f24782b075bf28f9b46b37439cc1a952026565ce7450587462eb7dafe93a4"

RPROVIDES:${PN} += "libffcall.so.0 \
libffcall0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
