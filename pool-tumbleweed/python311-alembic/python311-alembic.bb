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

RPM_NAME = "python311-alembic-1.11.2-1.1.noarch.rpm"
RPM_HASH = "95d4786471d592f5a9a0a6f9bfdde0bda32b0c9185e5ae04fbf52beb23a687e6e21b28aa45563ff9fdc61498d318280deb43fedacbb1331403dd259d346b48c3"
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
