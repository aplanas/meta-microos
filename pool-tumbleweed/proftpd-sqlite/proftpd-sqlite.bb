SUMMARY = "SQLite Module for ProFTPD"
DESCRIPTION = "This is the SQLite Module for ProFTPD"
LICENSE = "GPL-2.0-or-later"

PV = "1.3.7f"

RPM_NAME = "proftpd-sqlite-1.3.7f-1.4.aarch64.rpm"
RPM_HASH = "1c5f40aac63a51618303ee948aaf66228423e7eb21315bcccd2f132e1d51f174a64e925b1c19646d67d30e617f8b6549f0c5970720fd836b7835bbd1d85bbf6a"

RPROVIDES:${PN} += "proftpd-sqlite"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsqlite3.so.0 \
proftpd"

inherit rpm
