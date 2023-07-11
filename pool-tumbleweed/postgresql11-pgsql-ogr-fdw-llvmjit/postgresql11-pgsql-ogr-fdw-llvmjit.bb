SUMMARY = "Just-in-time compilation support for PostgreSQL pgsql-ogr-fdw extension"
DESCRIPTION = "This package contains support for just-in-time compiling parts of \
PostgreSQL queries. Using LLVM it compiles e.g. expressions and tuple \
deforming into native code, with the goal of accelerating analytics \
queries."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "postgresql11-pgsql-ogr-fdw-llvmjit-1.1.0-4.4.aarch64.rpm"
RPM_HASH = "f4c895734d83b560ad45fe6fba91170e1653a5a9df4846d67def254e1ddb30c38552f5535932731ff2567259411f084d74139664e1b06bab17001586e4580ea0"

RPROVIDES:${PN} += "postgresql11-pgsql-ogr-fdw-llvmjit"

RDEPENDS:${PN} += "postgresql11-llvmjit \
postgresql11-pgsql-ogr-fdw \
postgresql11-server"

inherit rpm
