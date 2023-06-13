SUMMARY = "Kerberos 5 support for freeradius"
DESCRIPTION = "FreeRADIUS plugin providing Kerberos 5 authentication support."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "3.2.1"

RPM_NAME = "freeradius-server-krb5-3.2.1-1.3.aarch64.rpm"
RPM_HASH = "45647954f7c0777cdcfe850f6cf3ab1955e6da687fac24aa060b90a5d8820113b460592c911e59ab0e222e4f90ac0dcb98fe35c3d37dfd3955e8626c36d89b68"

RPROVIDES:${PN} += "config(freeradius-server-krb5) \
freeradius-server-krb5 \
freeradius-server-krb5(aarch-64)"

RDEPENDS:${PN} += "freeradius-server \
libc.so.6()(64bit) \
libcom_err.so.2()(64bit) \
libkrb5.so.3()(64bit) \
libkrb5.so.3(krb5_3_MIT)(64bit)"

inherit rpm
