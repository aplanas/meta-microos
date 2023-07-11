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

RPM_NAME = "python310-alembic-1.10.4-2.3.noarch.rpm"
RPM_HASH = "a327ff236ca1710d4c613e1b4c320f1b42bc1e678104369a98359243348f99763c9cb264b5ed4aa1f1b65ee8a859b607e862e277a87cfa37341dfd9a96a43b4b"
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
