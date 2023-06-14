SUMMARY = "HTTP/IPP communication and printer queue and job library"
DESCRIPTION = "The CUPS library contains all of the core HTTP and IPP communications \
code as well as convenience functions for queuing print jobs, getting \
printer information, accessing resources via HTTP and IPP, and \
manipulating PPD files. The scheduler and all commands, filters, and \
backends use this library."
LICENSE = "Apache-2.0"

PV = "2.4.2"

RPM_NAME = "libcups2-2.4.2-5.1.aarch64.rpm"
RPM_HASH = "e409d5ba207ce51bb77f3be79e0dfa03854bcadfdfbe92a19a9fb075cd2b33dbaaf245004ec382f9b8a08d43061220a8f4c28140d7a57381a9a15285ec88b695"

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
