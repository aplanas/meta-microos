SUMMARY = "Just-in-time compilation support for PostgreSQL"
DESCRIPTION = "PostgreSQL is an advanced object-relational database management system \
that supports an extended subset of the SQL standard, including \
transactions, foreign keys, sub-queries, triggers, and user-defined \
types and functions. \
 \
This package contains support for just-in-time compiling parts of \
PostgreSQL queries. Using LLVM it compiles e.g. expressions and tuple \
deforming into native code, with the goal of accelerating analytics \
queries."
LICENSE = "PostgreSQL"

PV = "15"

RPM_NAME = "postgresql-llvmjit-15-2.12.noarch.rpm"
RPM_HASH = "b283605d3660628b6538f46e72829327c87159a7258e869de98e02b90f01e36c217884d4c098b6e322ed76104ee9759ed63f32e4495e812466141ce6fc4620e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "postgresql-llvmjit \
postgresql-llvmjit-noarch"

RDEPENDS:${PN} += "postgresql-llvmjit-implementation"

inherit rpm
