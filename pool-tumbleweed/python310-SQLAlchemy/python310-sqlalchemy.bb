SUMMARY = "Database Abstraction Library"
DESCRIPTION = "SQLAlchemy is an Object Relational Mappper (ORM) that provides a flexible, \
high-level interface to SQL databases.  Database and domain concepts are \
decoupled, allowing both sides maximum flexibility and power. SQLAlchemy \
provides a powerful mapping layer that can work as automatically or as manually \
as you choose, determining relationships based on foreign keys or letting you \
define the join conditions explicitly, to bridge the gap between database and \
domain."
LICENSE = "MIT"

PV = "2.0.19"

RPM_NAME = "python310-SQLAlchemy-2.0.19-2.1.aarch64.rpm"
RPM_HASH = "5dcd7f3ce1462acf808946a0fb8c8fe7cb4eadc59e8b907ec696f84db40e9dd3ebcb927183987b7131714399b4586399337e567b20a0d6c4d15face737ddb92b"

RPROVIDES:${PN} += "python3.10dist-sqlalchemy \
python310-SQLAlchemy \
python310-sqlalchemy \
python3dist-sqlalchemy"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python310 \
python310-greenlet \
python310-typing-extensions"

inherit rpm
