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

RPM_NAME = "python39-alembic-1.10.4-2.3.noarch.rpm"
RPM_HASH = "52952da6b0b82bfa9efb37fa9b1f5400275d97b98b1dac54fee8d0c9ffce3880d91f6aaf7eb4a2eee36ca633f7b6791812e4703d8c4d3a2d6bdc9769518d236d"
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
