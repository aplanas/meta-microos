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

RPM_NAME = "python311-alembic-1.10.4-1.1.noarch.rpm"
RPM_HASH = "62b7dcdcde9c47cfe222385ec6f18031314c358ca7601e0a5799b00dcc63a200df0ba38e05993bd4e0004008de6028bffadb28bc09dc9feb8d1e386cc8adea20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(alembic) \
python311-alembic \
python3dist(alembic)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-Mako \
python311-SQLAlchemy \
python311-python-dateutil \
python311-typing-extensions \
update-alternatives"

inherit rpm
