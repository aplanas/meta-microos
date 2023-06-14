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

RPM_NAME = "postgresql15-pgaudit-1.7.0-4.2.aarch64.rpm"
RPM_HASH = "ac921a2f2ab0717e2bf246207a9eff6ce22b6f6ae24b04a4c31d7794478d4e9d681949ec7bf2ad29e1089414c0bbaa50be2a04ce41192663bf10bf6aad515ee5"

RPROVIDES:${PN} += "postgresql15-pgaudit \
postgresql15-pgaudit-llvmjit"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
postgresql15-server"

inherit rpm
