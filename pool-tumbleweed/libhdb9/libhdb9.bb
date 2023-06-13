SUMMARY = "Heimdal database backend library"
DESCRIPTION = "libhdb provides the backend support for Heimdal kdc and kadmind. Its \
here where plugins for diffrent database engines can be pluged in and \
extend support for here Heimdal get the principal and policy data \
from. \
 \
Example of Heimdal backend are: Berkeley DB (BDB), NDB, LDAP."
LICENSE = "BSD-3-Clause"

PV = "7.8.0"

RPM_NAME = "libhdb9-7.8.0-3.1.aarch64.rpm"
RPM_HASH = "23936668919492021f19a04d165e25399c439353ec8fdc4ca156ef258e321a5ac09c8d8aeb1efd7a844d67704da6590e3fef313123a5ff938cb363fcd6446910"

RPROVIDES:${PN} += "libhdb.so.9()(64bit) \
libhdb.so.9(HEIMDAL_HDB_1.0)(64bit) \
libhdb9 \
libhdb9(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libasn1.so.8()(64bit) \
libasn1.so.8(HEIMDAL_ASN1_1.0)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcom_err.so.2()(64bit) \
libdb-4.8.so()(64bit) \
libheimbase.so.1()(64bit) \
libheimbase.so.1(HEIMDAL_BASE_1.0)(64bit) \
libkrb5.so.26()(64bit) \
libkrb5.so.26(HEIMDAL_KRB5_2.0)(64bit) \
libroken.so.18()(64bit) \
libroken.so.18(HEIMDAL_ROKEN_1.0)(64bit) \
libsqlite3.so.0()(64bit)"

inherit rpm
