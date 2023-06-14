SUMMARY = "A straightforward implementation of DBM"
DESCRIPTION = "Kyoto Cabinet is a library of routines for managing a database. The database \
is a simple data file containing records, each is a pair of a key and a \
value. Every key and value is serial bytes with variable length. Both binary \
data and character string can be used as a key and a value. Each key \
must be unique within a database. There is neither concept of data tables \
nor data types. Records are organized in hash table or B+ tree. \
 \
Kyoto Cabinet runs very fast. For example, elapsed time to store one \
million records is 0.9 seconds for hash database, and 1.1 seconds for B+ tree \
database. Moreover, the size of database is very small. For example, overhead \
for a record is 16 bytes for hash database, and 4 bytes for B+ tree database. \
Furthermore, scalability of Kyoto Cabinet is great. The database size can be \
up to 8EB (9.22e18 bytes). \
 \
Kyoto Cabinet is written in the C++ language, and provided as API of C++, C, \
Java, Python, Ruby, Perl, and Lua. Kyoto Cabinet is available on platforms \
which have API conforming to C++03 with the TR1 library extensions. \
Kyoto Cabinet is a free software licensed under the GNU General Public License. \
On the other hand, a commercial license is also provided. If you use \
Kyoto Cabinet within a proprietary software, the commercial license is required. \
 \
This package contains the command-line utilities to manage KyotoCabinet \
database files."
LICENSE = "SUSE-GPL-3.0-with-FLOSS-exception"

PV = "1.2.77"

RPM_NAME = "kyotocabinet-1.2.77-3.1.aarch64.rpm"
RPM_HASH = "30595e092492f8e73407e9c918ad1ebd6ed1a06ef040cea7d4e2f07004b228e2577eb587f34ba3dae9dbc490d5b73790ac5fc896374e5860cf3b16185c5d769e"

RPROVIDES:${PN} += "kyotocabinet"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libkyotocabinet.so.16 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
