SUMMARY = "E2fsprogs error reporting library"
DESCRIPTION = "com_err is an error message display library."
LICENSE = "MIT"

PV = "1.47.0"

RPM_NAME = "libcom_err2-1.47.0-1.1.aarch64.rpm"
RPM_HASH = "25475f78aa021c6cc29261e4af839b5aadab370cbe1b07be88b5aeeba2013f20f878c926f40ba5eb13f93fd06c3ec739abf6ec796f2400ed556d3c1a3c399da6"

RPROVIDES:${PN} += "libcom-err \
libcom-err.so.2 \
libcom-err2 \
libss.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
