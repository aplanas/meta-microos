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

RPM_NAME = "python39-alembic-1.11.2-1.1.noarch.rpm"
RPM_HASH = "aedb9ff761eee38199e88bc5041d6d51d46ec5321c26358cf1eee31dc20874ae98d7da7f4e91524f3014d2735d36bc39b360eeb15229c89a73f3a17b06639d36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-alembic \
python39-alembic \
python3dist-alembic"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-Mako \
python39-SQLAlchemy \
python39-python-dateutil \
python39-typing-extensions \
update-alternatives"

inherit rpm
