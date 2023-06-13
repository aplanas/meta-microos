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

PV = "1.10.4"

RPM_NAME = "python310-alembic-1.10.4-1.1.noarch.rpm"
RPM_HASH = "b9104b87576e1c228122d4fd9dff6c791e341d097f820ef876b018f2a2317f058f10cda44a684448c382114c7710e41bbcdf5994dc946d8f00a309d6ad07188f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-alembic \
python3.10dist(alembic) \
python310-alembic \
python3dist(alembic)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-Mako \
python310-SQLAlchemy \
python310-python-dateutil \
python310-typing-extensions \
update-alternatives"

inherit rpm
