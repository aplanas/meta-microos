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

RPM_NAME = "python39-Beaker-1.12.1-1.6.noarch.rpm"
RPM_HASH = "9df5c0f79a587f4890451c903f8002a3150d33b421db765d01e3b2f18d570c2b40bce41d6e5ee574bc977e84e81b02f1294ffd0d4ddb32a3d7d9bbf9a35842c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-beaker \
python39-Beaker \
python3dist-beaker"

RDEPENDS:${PN} += "python-abi \
python39-dbm \
python39-pylibmc \
python39-setuptools"

inherit rpm
