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

RPM_NAME = "postgresql11-pgaudit-1.3.4-4.3.aarch64.rpm"
RPM_HASH = "51464a82b701c046579691df844d44e1f90f05de437c005c9f40c29edde954e9dd78cc798b5bb5d029a374554a416070fecda3c2bd653977c368902c2625b980"

RPROVIDES:${PN} += "postgresql11-pgaudit \
postgresql11-pgaudit-llvmjit"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
postgresql11-server"

inherit rpm
