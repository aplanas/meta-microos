SUMMARY = "A Session and Caching library with WSGI Middleware"
DESCRIPTION = "Beaker is a web session and general caching library that includes WSGI \
middleware for use in web applications. \
 \
As a general caching library, Beaker can handle storing for various times \
any Python object that can be pickled with optional back-ends on a \
fine-grained basis. \
 \
Beaker was built largely on the code from MyghtyUtils, then refactored and \
extended with database support. \
 \
Beaker includes Cache and Session WSGI middleware to ease integration with \
WSGI capable frameworks, and is automatically used by Pylons. \
 \
Features include: \
 \
* Fast, robust performance \
* Multiple reader/single writer lock system to avoid duplicate simultaneous \
  cache creation \
* Cache back-ends include dbm, file, memory, memcached, and database (Using \
  SQLAlchemy for multiple-db vendor support) \
* Signed cookie's to prevent session hijacking/spoofing \
* Cookie-only sessions to remove the need for a db or file backend (ideal \
  for clustered systems) \
* Extensible Container object to support new back-ends \
* Cache's can be divided into namespaces (to represent templates, objects, \
  etc.) then keyed for different copies \
* Create functions for automatic call-backs to create new cache copies after \
  expiration \
* Fine-grained toggling of back-ends, keys, and expiration per Cache object"
LICENSE = "BSD-3-Clause"

PV = "1.12.1"

RPM_NAME = "python39-Beaker-1.12.1-1.4.noarch.rpm"
RPM_HASH = "2fc59f9357bf4ff779b5a3394746297340d6603a32987a9de1a3f953727c95f707cdf32f5776e07063784d8a4b7f591abf5f12c4b735bc64cfb3dd4a996a1cf7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(beaker) \
python39-Beaker \
python3dist(beaker)"

RDEPENDS:${PN} += "python(abi) \
python39-dbm \
python39-pylibmc \
python39-setuptools"

inherit rpm
