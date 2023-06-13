SUMMARY = "Pg is the Ruby interface to the PostgreSQL RDBMS"
DESCRIPTION = "Pg is the Ruby interface to the PostgreSQL RDBMS. It works with PostgreSQL 9.3 \
and later."
LICENSE = "BSD-2-Clause"

PV = "1.4.5"

RPM_NAME = "ruby3.2-rubygem-pg-1.4.5-1.6.aarch64.rpm"
RPM_HASH = "a723b5e94dbe118e40a999f7892c54c91df13b2e26b759e19f91772b47e08ec770020656f9bbefda2836914db01376d8a072b6a14be45415d1ff57b03b0963ea"

RPROVIDES:${PN} += "ruby3.2-rubygem-pg \
ruby3.2-rubygem-pg(aarch-64) \
rubygem(pg) \
rubygem(ruby:3.2.0:pg) \
rubygem(ruby:3.2.0:pg:1) \
rubygem(ruby:3.2.0:pg:1.4) \
rubygem(ruby:3.2.0:pg:1.4.5)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libpq.so.5()(64bit) \
libruby3.2.so.3.2()(64bit) \
ruby(abi)"

inherit rpm
