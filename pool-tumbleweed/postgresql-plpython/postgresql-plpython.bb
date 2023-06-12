SUMMARY = "The PL/Python Procedural Languages for PostgreSQL"
DESCRIPTION = "PostgreSQL is an advanced object-relational database management system \
that supports an extended subset of the SQL standard, including \
transactions, foreign keys, subqueries, triggers, and user-defined \
types and functions. \
 \
This package contains the PL/Python procedural language for PostgreSQL. \
With this module one can use Python to write stored procedures, \
functions, and triggers."
LICENSE = "PostgreSQL"

PV = "15"

RPM_NAME = "postgresql-plpython-15-2.7.noarch.rpm"
RPM_HASH = "3d2abcbd8f53738237a0f7b559d6b2b68604ffed7aef948c3bda74637d1f59b7528c91c2dbf4408481e47269e81c6eab34568066588f99ab77ebf3ca19d7ec28"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "postgresql-plpython \
postgresql-plpython-noarch"
RDEPENDS:${PN} += "postgresql-plpython-implementation"

inherit rpm
