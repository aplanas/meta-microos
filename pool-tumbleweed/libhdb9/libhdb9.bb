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

RPROVIDES:${PN} += "libhdb.so.9 \
libhdb9"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libasn1.so.8 \
libc.so.6 \
libcom-err.so.2 \
libdb-4.8.so \
libheimbase.so.1 \
libkrb5.so.26 \
libroken.so.18 \
libsqlite3.so.0"

inherit rpm
