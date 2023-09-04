SUMMARY = "A database migration tool for SQLAlchemy"
DESCRIPTION = "Alembic is a new database migrations tool, written by the author \
of SQLAlchemy <http://www.sqlalchemy.org>.  A migrations tool \
offers the following functionality: \
 \
* Can emit ALTER statements to a database in order to change \
  the structure of tables and other constructs \
* Provides a system whereby 'migration scripts' may be constructed; \
  each script indicates a particular series of steps that can 'upgrade' a \
  target database to a new version, and optionally a series of steps that can \
  'downgrade' similarly, doing the same steps in reverse. \
* Allows the scripts to execute in some sequential manner."
LICENSE = "MIT"

PV = "1.11.2"

RPM_NAME = "python310-alembic-1.11.2-1.1.noarch.rpm"
RPM_HASH = "3b223956a9f750b9c53f91b4cc92cd25c1d3d8ba2bcbb3222913f00a0c01d5fec825a8bb1fda707ca02e6c89783bf503037088a4070e7ca98ac51d2fad12ad8d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-alembic \
python310-alembic \
python3dist-alembic"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-Mako \
python310-SQLAlchemy \
python310-python-dateutil \
python310-typing-extensions \
update-alternatives"

inherit rpm
