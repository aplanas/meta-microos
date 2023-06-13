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

RPM_NAME = "python310-django-pglocks-1.0.4-1.13.noarch.rpm"
RPM_HASH = "26ac48b6bb164a4a08c3e3bf8a0f561d42c515f11885abbfe1b5f48c6397953128c4f5c1c9bd72fba0ab832ebd80f6ed8996ba21505d550334d077107f9dca3c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-pglocks \
python3.10dist(django-pglocks) \
python310-django-pglocks \
python3dist(django-pglocks)"

RDEPENDS:${PN} += "python(abi) \
python310-Django \
python310-psycopg2"

inherit rpm
