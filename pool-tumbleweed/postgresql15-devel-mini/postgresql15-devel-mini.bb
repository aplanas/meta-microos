SUMMARY = "PostgreSQL client development header files and libraries"
DESCRIPTION = "PostgreSQL is an advanced object-relational database management system \
that supports an extended subset of the SQL standard, including \
transactions, foreign keys, subqueries, triggers, and user-defined \
types and functions. \
 \
This package contains the header files and libraries needed to compile \
C applications which will directly interact with a PostgreSQL database \
management server and the ECPG Embedded C Postgres preprocessor. You \
need to install this package if you want to develop applications in C \
which will interact with a PostgreSQL server. \
 \
For building PostgreSQL server extensions, see the \
postgresql15-server-devel package."
LICENSE = "PostgreSQL"

PV = "15.3"

RPM_NAME = "postgresql15-devel-mini-15.3-1.1.aarch64.rpm"
RPM_HASH = "5dae0cf88a1f754d68e84943cc95aa28d80e29576c67c062436c7b8f4a3c7948907cf024516e27c2f1dcec3ecba7ecc3c6de37e0e9a0d7e48157791f1a7b895b"

RPROVIDES:${PN} += "libecpg.so.6()(64bit) \
libecpg6 \
libecpg_compat.so.3()(64bit) \
libpgtypes.so.3()(64bit) \
libpq.so.5()(64bit) \
libpq5 \
pkgconfig(libecpg) \
pkgconfig(libecpg_compat) \
pkgconfig(libpgtypes) \
pkgconfig(libpq) \
postgresql-devel \
postgresql-devel-exclusive \
postgresql-devel-implementation \
postgresql15-devel \
postgresql15-devel-mini \
postgresql15-devel-mini(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/pkg-config \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libgssapi_krb5.so.2()(64bit) \
libgssapi_krb5.so.2(gssapi_krb5_2_MIT)(64bit) \
libldap.so.2()(64bit) \
libldap.so.2(OPENLDAP_2.200)(64bit) \
libssl.so.3()(64bit) \
libssl.so.3(OPENSSL_3.0.0)(64bit) \
pkgconfig(libcrypto) \
pkgconfig(libecpg) \
pkgconfig(libpgtypes) \
pkgconfig(libpq) \
pkgconfig(libssl) \
this-is-only-for-build-envs"

inherit rpm
