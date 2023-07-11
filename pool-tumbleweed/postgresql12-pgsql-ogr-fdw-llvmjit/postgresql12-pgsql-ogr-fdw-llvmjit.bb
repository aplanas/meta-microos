SUMMARY = "Just-in-time compilation support for PostgreSQL pgsql-ogr-fdw extension"
DESCRIPTION = "This package contains support for just-in-time compiling parts of \
PostgreSQL queries. Using LLVM it compiles e.g. expressions and tuple \
deforming into native code, with the goal of accelerating analytics \
queries."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "postgresql12-pgsql-ogr-fdw-llvmjit-1.1.0-4.4.aarch64.rpm"
RPM_HASH = "d0ebbbb4725b44d10c66e3108274f3fe5fa69ac12196f811e56c32e8a53bc5356409c13607e340c7a12718357f8cfa8197bda5b7e4b66278fd9c33f2efc60d24"

RPROVIDES:${PN} += "postgresql12-pgsql-ogr-fdw-llvmjit"

RDEPENDS:${PN} += "postgresql12-llvmjit \
postgresql12-pgsql-ogr-fdw \
postgresql12-server"

inherit rpm
