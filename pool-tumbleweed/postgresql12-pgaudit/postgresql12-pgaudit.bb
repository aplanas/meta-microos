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

PV = "1.4.3"

RPM_NAME = "postgresql12-pgaudit-1.4.3-4.3.aarch64.rpm"
RPM_HASH = "325864a2ea706d1d2057e1fafa9ddcc6333e02c14e488914a2bfafe9c3451af6b9f2e7cdfe62a2b3f90618a763cf8a688481fd1d625abe353f8609e5ea57a6a2"

RPROVIDES:${PN} += "postgresql12-pgaudit \
postgresql12-pgaudit-llvmjit"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
postgresql12-server"

inherit rpm
