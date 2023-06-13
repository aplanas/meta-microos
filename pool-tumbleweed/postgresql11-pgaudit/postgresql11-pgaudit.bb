SUMMARY = "An auditing module for PostgreSQL"
DESCRIPTION = "This is the initial version of an auditing module for Postgres. \
 \
It collects audit events from various sources and logs them in CSV format \
including a timestamp, user information, details of objects affected (if any), \
and the fully-qualified command text (whenever available). \
 \
All DDL, DML (including SELECT), and utility commands are supported. These \
are categorised as described below, and audit logging for each group of \
commands may be enabled or disabled by the superuser. Once enabled, however, \
audit logging may not be disabled by a user."
LICENSE = "PostgreSQL"

PV = "1.3.4"

RPM_NAME = "postgresql11-pgaudit-1.3.4-4.2.aarch64.rpm"
RPM_HASH = "c1f7c765c88e463ab719ab3df5f1fa294afe905b4e4da37cc38b3ea2d7e7f8f97ed29420a018ad562de3960094b7d825cb86724bec33ee49593b2787e8f70ad0"

RPROVIDES:${PN} += "postgresql11-pgaudit \
postgresql11-pgaudit(aarch-64) \
postgresql11-pgaudit-llvmjit"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
postgresql11-server"

inherit rpm
