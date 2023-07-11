SUMMARY = "This module allows Ruby programs to interface with the SQLite3"
DESCRIPTION = "This module allows Ruby programs to interface with the SQLite3 \
database engine (http://www.sqlite.org).  You must have the \
SQLite engine installed in order to build this module. \
Note that this module is only compatible with SQLite 3.6.16 or newer."
LICENSE = "BSD-3-Clause"

PV = "1.4.4"

RPM_NAME = "ruby3.2-rubygem-sqlite3-1.4.4-1.9.aarch64.rpm"
RPM_HASH = "a5aab5cbf04083ccae9fec9762d20e297af63809108ce5695a27ed7e4738e3b2de3d8ea61b072661d1053baf87ab763788f529cf5e3d8abf9627742973ae91cf"

RPROVIDES:${PN} += "ruby3.2-rubygem-sqlite3 \
rubygem-ruby-3.2.0-sqlite3 \
rubygem-ruby-3.2.0-sqlite3-1 \
rubygem-ruby-3.2.0-sqlite3-1.4 \
rubygem-ruby-3.2.0-sqlite3-1.4.4 \
rubygem-sqlite3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libruby3.2.so.3.2 \
libsqlite3.so.0 \
ruby-abi"

inherit rpm
