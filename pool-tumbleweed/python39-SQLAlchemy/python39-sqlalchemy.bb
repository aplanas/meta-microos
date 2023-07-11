SUMMARY = "Database Abstraction Library"
DESCRIPTION = "SQLAlchemy is an Object Relational Mappper (ORM) that provides a flexible, \
high-level interface to SQL databases.  Database and domain concepts are \
decoupled, allowing both sides maximum flexibility and power. SQLAlchemy \
provides a powerful mapping layer that can work as automatically or as manually \
as you choose, determining relationships based on foreign keys or letting you \
define the join conditions explicitly, to bridge the gap between database and \
domain."
LICENSE = "MIT"

PV = "2.0.16"

RPM_NAME = "python39-SQLAlchemy-2.0.16-1.1.aarch64.rpm"
RPM_HASH = "1a6eb2995780c817527d6356567aca3bc847119621edf9fce74d5dfd6c4c7e952865d73889d8a421245c8bf833783a2319f0de4a1dc4f49eaec2c7b14c7b7349"

RPROVIDES:${PN} += "python3.9dist-sqlalchemy \
python39-SQLAlchemy \
python39-sqlalchemy \
python3dist-sqlalchemy"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python39 \
python39-greenlet \
python39-typing-extensions"

inherit rpm
