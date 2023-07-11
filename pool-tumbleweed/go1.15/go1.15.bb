SUMMARY = "A compiled, garbage-collected, concurrent programming language"
DESCRIPTION = "Go is an expressive, concurrent, garbage collected systems programming language \
that is type safe and memory safe. It has pointers but no pointer arithmetic. \
Go has fast builds, clean syntax, garbage collection, methods for any type, and \
run-time reflection. It feels like a dynamic language but has the speed and \
safety of a static language."
LICENSE = "BSD-3-Clause"

PV = "1.15.15"

RPM_NAME = "go1.15-1.15.15-1.13.aarch64.rpm"
RPM_HASH = "36c72321806337d34f04c21f1faa1e2422cfe3ed91c9a25055e45c87c73ca0b6b7edbfe1b107091fca21ac9d637e36a6be376df906ed49ae22b57b6dc726cf3d"

RPROVIDES:${PN} += "config-go1.15 \
go \
go-devel \
go-devel-static \
go1.15 \
golang-API \
libstd.so"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
binutils-gold \
gcc \
libc.so.6 \
update-alternatives"

inherit rpm
