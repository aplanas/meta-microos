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

RPM_NAME = "postgresql-llvmjit-15-2.10.noarch.rpm"
RPM_HASH = "74101fe650973713ff3b396236bc835dbd031354eba9c8f8cad879f5d1ecdc2b972b892142bf52d28440f251125642654f1bad2fa006b3bff0e42a5c09cba0b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "postgresql-llvmjit \
postgresql-llvmjit-noarch"

RDEPENDS:${PN} += "postgresql-llvmjit-implementation"

inherit rpm
