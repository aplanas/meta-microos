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
rpm_macro(make_pgxs) \
rpm_macro(make_pgxs_install) \
rpm_macro(pg_config_bindir) \
rpm_macro(pg_config_cc) \
rpm_macro(pg_config_cflags) \
rpm_macro(pg_config_cflags_sl) \
rpm_macro(pg_config_configure) \
rpm_macro(pg_config_cppflags) \
rpm_macro(pg_config_docdir) \
rpm_macro(pg_config_htmldir) \
rpm_macro(pg_config_includedir) \
rpm_macro(pg_config_includedir_server) \
rpm_macro(pg_config_ldflags) \
rpm_macro(pg_config_ldflags_ex) \
rpm_macro(pg_config_ldflags_sl) \
rpm_macro(pg_config_libdir) \
rpm_macro(pg_config_libs) \
rpm_macro(pg_config_localedir) \
rpm_macro(pg_config_mandir) \
rpm_macro(pg_config_pgxs) \
rpm_macro(pg_config_pkgincludedir) \
rpm_macro(pg_config_pkglibdir) \
rpm_macro(pg_config_sharedir) \
rpm_macro(pg_config_sysconfdir) \
rpm_macro(pg_obsolete_llvm_subpackage) \
rpm_macro(pg_server_requires) \
rpm_macro(pg_version_from_name) \
rpm_macro(postgresql_has_llvm)"
RDEPENDS:${PN} += "postgresql-server-devel-implementation"

inherit rpm
