SUMMARY = "HTTP/IPP communication and printer queue and job library"
DESCRIPTION = "The CUPS library contains all of the core HTTP and IPP communications \
code as well as convenience functions for queuing print jobs, getting \
printer information, accessing resources via HTTP and IPP, and \
manipulating PPD files. The scheduler and all commands, filters, and \
backends use this library."
LICENSE = "Apache-2.0"

PV = "2.4.2"

RPM_NAME = "libcups2-2.4.2-6.1.aarch64.rpm"
RPM_HASH = "df4acb238f5e401ce60a196c9947cd2362c01b8fe3c8850f062aae709cc1def6d04a323d7c584391b25ee54a57e81c9c2a494e4881a43965152149513b5bca53"

RPROVIDES:${PN} += "cups-libs \
libcups.so.2 \
libcups2"

RDEPENDS:${PN} += "/sbin/ldconfig \
cups-config \
ld-linux-aarch64.so.1 \
libavahi-client.so.3 \
libavahi-common.so.3 \
libc.so.6 \
libgnutls.so.30 \
libgssapi-krb5.so.2 \
libm.so.6 \
libz.so.1"

inherit rpm
