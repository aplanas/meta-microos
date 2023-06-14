SUMMARY = "Database abstraction layer"
DESCRIPTION = "PEAR MDB2 is a merge of the PEAR DB and Metabase php database abstraction layers. \
 \
It provides a common API for all supported RDBMS. The main difference to most \
other DB abstraction packages is that MDB2 goes much further to ensure \
portability. MDB2 provides most of its many features optionally that \
can be used to construct portable SQL statements: \
* Object-Oriented API \
* A DSN (data source name) or array format for specifying database servers \
* Datatype abstraction and on demand datatype conversion \
* Various optional fetch modes to fix portability issues \
* Portable error codes \
* Sequential and non sequential row fetching as well as bulk fetching \
* Ability to make buffered and unbuffered queries \
* Ordered array and associative array for the fetched rows \
* Prepare/execute (bind) named and unnamed placeholder emulation \
* Sequence/autoincrement emulation \
* Replace emulation \
* Limited sub select emulation \
* Row limit emulation \
* Transactions/savepoint support \
* Large Object support \
* Index/Unique Key/Primary Key support \
* Pattern matching abstraction \
* Module framework to load advanced functionality on demand \
* Ability to read the information schema \
* RDBMS management methods (creating, dropping, altering) \
* Reverse engineering schemas from an existing database \
* SQL function call abstraction \
* Full integration into the PEAR Framework \
* PHPDoc API documentation"
LICENSE = "BSD-3-Clause"

PV = "2.5.0b5"

RPM_NAME = "php-pear-MDB2-2.5.0b5-1.10.noarch.rpm"
RPM_HASH = "f4a31f8a5d314fb8ba95e1d6fda0f3c2de473f9d58a3ffb92992f865b5b81e7ad97988a79a16b4d8d5970784da9b0ee6637e8fd200410f4f8508facf86401d53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "php-pear-MDB2 \
php5-pear-MDB2 \
php7-pear-MDB2"

RDEPENDS:${PN} += "/bin/sh \
php-pear"

inherit rpm
