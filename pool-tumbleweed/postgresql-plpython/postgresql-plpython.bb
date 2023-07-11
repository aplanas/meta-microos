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

RPM_NAME = "postgresql-plpython-15-2.10.noarch.rpm"
RPM_HASH = "71f0c32f44302d33e0554e8de3d87c25906a9095bf0d913d2c5397eaa0eb49d295842f19c5d9bb9a7eb2bb968e171f1fec4136787c687a18f12361e746ef40e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "postgresql-plpython \
postgresql-plpython-noarch"

RDEPENDS:${PN} += "postgresql-plpython-implementation"

inherit rpm
