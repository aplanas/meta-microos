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

PV = "1.6.2"

RPM_NAME = "postgresql14-pgaudit-1.6.2-4.2.aarch64.rpm"
RPM_HASH = "d7f78cd842927b2fcd737d6539a5b6781eb9dc837ec41d38ba81becd5e5d741925afdc746a943c8151f6c44121c150a04d4677b14f08a7e30b1a04b086bdfb80"

RPROVIDES:${PN} += "postgresql14-pgaudit \
postgresql14-pgaudit-llvmjit"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
postgresql14-server"

inherit rpm
