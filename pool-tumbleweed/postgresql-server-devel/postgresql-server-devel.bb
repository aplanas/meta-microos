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

RPM_NAME = "postgresql-server-devel-15-2.10.noarch.rpm"
RPM_HASH = "1a914e0fd9a70b2cc212fafe91ea636e99d36d91aa5bda315235db6248f07dd04e21098ed15da3c9ce68fe52f73477265d422f958d390594ceda27d0ee003900"
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
