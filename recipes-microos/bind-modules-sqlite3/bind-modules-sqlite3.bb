SUMMARY = "A DLZ module which stores zone data in an sqlite3 db"
DESCRIPTION = "This package provides the externally loadable SQLitee DLZ module, without \
update support."
LICENSE = "MPL-2.0"

PV = "9.18.14"

RPM_NAME = "bind-modules-sqlite3-9.18.14-1.1.aarch64.rpm"
RPM_HASH = "d70cf458b946bd4038ee54d3c2bf81d6e6188c647961bf0daee6373a79fad4f2f2111b2a4f613bf5bb20e224c9312b710baead5bf0702d1b606b7145df22a3ba"

RPROVIDES:${PN} += "bind-modules-sqlite3 bind-modules-sqlite3(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libsqlite3.so.0()(64bit)"

inherit rpm
