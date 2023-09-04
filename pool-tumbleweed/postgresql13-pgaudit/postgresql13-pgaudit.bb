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

PV = "1.5.2"

RPM_NAME = "postgresql13-pgaudit-1.5.2-4.3.aarch64.rpm"
RPM_HASH = "1ee2c7672dfaa4a82c0286c2bb3223e5e4bfb6b2f04ca509b17f450eee77d0ca78e07dd6ebab922858c296a0a344f6b4699e06947663cdfb6c921b0fe8ddc635"

RPROVIDES:${PN} += "postgresql13-pgaudit \
postgresql13-pgaudit-llvmjit"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
postgresql13-server"

inherit rpm
