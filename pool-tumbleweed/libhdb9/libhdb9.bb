SUMMARY = "Heimdal database backend library"
DESCRIPTION = "libhdb provides the backend support for Heimdal kdc and kadmind. Its \
here where plugins for diffrent database engines can be pluged in and \
extend support for here Heimdal get the principal and policy data \
from. \
 \
Example of Heimdal backend are: Berkeley DB (BDB), NDB, LDAP."
LICENSE = "BSD-3-Clause"

PV = "7.8.0"

RPM_NAME = "libhdb9-7.8.0-3.2.aarch64.rpm"
RPM_HASH = "1fb00f1cdecb01acefea40e1828b57e0a610e179c8be5e9cc3ff0349bc2ee0905603661061da7339508fbfd27f1ccb7ad6b2f2787be14e120ca3c3feafaeac21"

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
