SUMMARY = "The TCP wrapper library"
DESCRIPTION = "This package contains a library which implements classifying incoming \
requests (connections) based upon rule exclusion files (/etc/hosts.*)."
LICENSE = "BSD-3-Clause"

PV = "7.6"

RPM_NAME = "libwrap0-7.6-895.4.aarch64.rpm"
RPM_HASH = "df71e858ef1222aa03e8b2a2a1ab8cd8fde6c4dd70cdcefdcad4e49ec22f1a3b5441fc4572f1f2731fc124c1408bcacaa14b1d52d90ae273c5969f4d55c2e59c"

RPROVIDES:${PN} += "config-libwrap0 \
libwrap.so.0 \
libwrap0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
