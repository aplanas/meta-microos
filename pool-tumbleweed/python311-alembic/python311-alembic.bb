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

RPM_NAME = "python311-alembic-1.10.4-2.3.noarch.rpm"
RPM_HASH = "ec7558d7cab493f71d9b9db0a070f9c931d1018f25e48b2cbb6f8fe6d2928acbfb4386124fa15f2d77d8ea6b053191082cff39fdd2c766acc6e7034e6690d5e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-alembic \
python3.11dist-alembic \
python311-alembic \
python3dist-alembic"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-Mako \
python311-SQLAlchemy \
python311-python-dateutil \
python311-typing-extensions \
update-alternatives"

inherit rpm
