SUMMARY = "Arel Really Exasperates Logicians"
DESCRIPTION = "Arel Really Exasperates Logicians \
Arel is a SQL AST manager for Ruby. It \
1. Simplifies the generation of complex SQL queries \
2. Adapts to various RDBMSes \
It is intended to be a framework framework; that is, you can build your own \
ORM \
with it, focusing on innovative object and collection modeling as opposed to \
database compatibility and query generation."
LICENSE = "MIT"

PV = "9.0.0"

RPM_NAME = "ruby3.2-rubygem-arel-9.0.0-2.20.aarch64.rpm"
RPM_HASH = "7173a1438acc54806ef5f4c32f017b317437999d850be45c20272591f6d8f2598e8b89c66449c20c620f6a3fadd87070652fc8c90b0a6e3607024b58c2b6aa64"

RPROVIDES:${PN} += "ruby3.2-rubygem-arel \
rubygem-arel \
rubygem-ruby-3.2.0-arel \
rubygem-ruby-3.2.0-arel-9 \
rubygem-ruby-3.2.0-arel-9.0 \
rubygem-ruby-3.2.0-arel-9.0.0"

RDEPENDS:${PN} += "ruby-abi"

inherit rpm
