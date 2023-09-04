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

PV = "1.7.0"

RPM_NAME = "postgresql15-pgaudit-1.7.0-4.3.aarch64.rpm"
RPM_HASH = "0e02650791b14dbde16bf6b7c2e320949847c6d728d28384ed7a7f518b9221eab78792d58818f440dedc755e9a9cad91f0ade4c23037093936324befbab8d613"

RPROVIDES:${PN} += "postgresql15-pgaudit \
postgresql15-pgaudit-llvmjit"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
postgresql15-server"

inherit rpm
