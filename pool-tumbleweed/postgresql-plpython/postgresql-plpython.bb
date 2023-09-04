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

RPM_NAME = "postgresql-plpython-15-2.12.noarch.rpm"
RPM_HASH = "a15025064a4db65ff8b42a8b6d4c0344f8296422d76b689343efe09627e0686e782d42d40800c474db8a7ff84e69529922dcf5fb28dd185fdaf177d56e4ffcfc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "postgresql-plpython \
postgresql-plpython-noarch"

RDEPENDS:${PN} += "postgresql-plpython-implementation"

inherit rpm
