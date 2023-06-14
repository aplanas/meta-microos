SUMMARY = "PostgreSQL server development header files and utilities"
DESCRIPTION = "PostgreSQL is an advanced object-relational database management system \
that supports an extended subset of the SQL standard, including \
transactions, foreign keys, subqueries, triggers, and user-defined \
types and functions. \
 \
This package contains the header files and libraries needed to compile \
C extensions that link into the PostgreSQL server. For building client \
applications, see the postgresql15-devel package."
LICENSE = "PostgreSQL"

PV = "15"

RPM_NAME = "postgresql-server-devel-15-2.7.noarch.rpm"
RPM_HASH = "2928c4140432de1f7e3791dae6d5072a137e480f4abfc3b028ea9a3501e69521160314abdb1f165629bbb5b4cc86acf9aa4960e3fd3b5174bd14db1deca13edf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "postgresql-server-devel \
postgresql-server-devel-noarch \
rpm-macro-make-pgxs \
rpm-macro-make-pgxs-install \
rpm-macro-pg-config-bindir \
rpm-macro-pg-config-cc \
rpm-macro-pg-config-cflags \
rpm-macro-pg-config-cflags-sl \
rpm-macro-pg-config-configure \
rpm-macro-pg-config-cppflags \
rpm-macro-pg-config-docdir \
rpm-macro-pg-config-htmldir \
rpm-macro-pg-config-includedir \
rpm-macro-pg-config-includedir-server \
rpm-macro-pg-config-ldflags \
rpm-macro-pg-config-ldflags-ex \
rpm-macro-pg-config-ldflags-sl \
rpm-macro-pg-config-libdir \
rpm-macro-pg-config-libs \
rpm-macro-pg-config-localedir \
rpm-macro-pg-config-mandir \
rpm-macro-pg-config-pgxs \
rpm-macro-pg-config-pkgincludedir \
rpm-macro-pg-config-pkglibdir \
rpm-macro-pg-config-sharedir \
rpm-macro-pg-config-sysconfdir \
rpm-macro-pg-obsolete-llvm-subpackage \
rpm-macro-pg-server-requires \
rpm-macro-pg-version-from-name \
rpm-macro-postgresql-has-llvm"

RDEPENDS:${PN} += "postgresql-server-devel-implementation"

inherit rpm
