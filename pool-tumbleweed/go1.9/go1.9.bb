SUMMARY = "A compiled, garbage-collected, concurrent programming language"
DESCRIPTION = "Go is an expressive, concurrent, garbage collected systems programming language \
that is type safe and memory safe. It has pointers but no pointer arithmetic. \
Go has fast builds, clean syntax, garbage collection, methods for any type, and \
run-time reflection. It feels like a dynamic language but has the speed and \
safety of a static language."
LICENSE = "BSD-3-Clause"

PV = "1.9.7"

RPM_NAME = "go1.9-1.9.7-12.11.aarch64.rpm"
RPM_HASH = "366fb6b40d9c452a90915b77794cc587993a818e1ea0ae8674de9766abd2be01ff00278b93d40aa53bafb1eba53c7497c56b0c0a165c1626c9b86fa5c68d2358"

RPROVIDES:${PN} += "config-go1.9 \
go \
go-devel \
go-devel-static \
go1.9 \
golang-API \
libstd.so"

RDEPENDS:${PN} += "/usr/bin/sh \
gcc \
libc.so.6 \
update-alternatives"

inherit rpm
