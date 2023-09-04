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

RPM_NAME = "postgresql-server-devel-15-2.12.noarch.rpm"
RPM_HASH = "240b36a4cf6d1431e2ba12bcfb2323a8c8f6693a49e436688ed0176cd3a5d8636f522854dcba624848925cb6f0f6befb51a687a7390c29258c07cea27055b377"
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
