SUMMARY = "Just-in-time compilation support for PostgreSQL pgsql-ogr-fdw extension"
DESCRIPTION = "This package contains support for just-in-time compiling parts of \
PostgreSQL queries. Using LLVM it compiles e.g. expressions and tuple \
deforming into native code, with the goal of accelerating analytics \
queries."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "postgresql11-pgsql-ogr-fdw-llvmjit-1.1.0-4.2.aarch64.rpm"
RPM_HASH = "bc437c1b7bbfdc9fff8b22013127640a0f9fb5fd663231eb583fa213506d8b838530d5c908e2758c9da24bf817a8dc8fdecc753bf2dd691242e0648a3b2dc6b6"

RPROVIDES:${PN} += "postgresql11-pgsql-ogr-fdw-llvmjit \
postgresql11-pgsql-ogr-fdw-llvmjit(aarch-64)"
RDEPENDS:${PN} += "postgresql11-llvmjit \
postgresql11-pgsql-ogr-fdw \
postgresql11-server"

inherit rpm
