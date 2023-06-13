SUMMARY = "PostgreSQL Advisory Locks for Django"
DESCRIPTION = "django-pglocks provides a useful context manager to manage PostgreSQL advisory \
locks. It requires Django (tested with 1.5), PostgreSQL, and (probably) psycopg2. \
 \
Advisory locks are application-level locks that are acquired and released purely \
by the client of the database; PostgreSQL never acquires them on its own. They \
are very useful as a way of signalling to other sessions that a higher-level \
resource than a single row is in use, without having to lock an entire table or \
some other structure. \
 \
It's entirely up to the application to correctly acquire the right lock. \
 \
Advisory locks are either session locks or transaction locks. A session lock is \
held until the database session disconnects (or is reset); a transaction lock is \
held until the transaction terminates. \
 \
Currently, the context manager only creates session locks, as the behavior of a \
lock persisting after the context body has been exited is surprising, and \
there's no way of releasing a transaction-scope advisory lock except to exit \
the transaction."
LICENSE = "MIT"

PV = "1.0.4"

RPM_NAME = "python39-django-pglocks-1.0.4-1.13.noarch.rpm"
RPM_HASH = "a6600d7448a40d4a94fc96bc32682b3f4496b000cc7de71c2445e0332d4023dd38a4ceaf1942697dddd9572300f1fea5daa6137908b84bad11ed0ac91d4a2f29"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(django-pglocks) \
python39-django-pglocks \
python3dist(django-pglocks)"

RDEPENDS:${PN} += "python(abi) \
python39-Django \
python39-psycopg2"

inherit rpm
