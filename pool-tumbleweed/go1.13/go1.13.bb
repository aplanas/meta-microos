SUMMARY = "A compiled, garbage-collected, concurrent programming language"
DESCRIPTION = "Go is an expressive, concurrent, garbage collected systems programming language \
that is type safe and memory safe. It has pointers but no pointer arithmetic. \
Go has fast builds, clean syntax, garbage collection, methods for any type, and \
run-time reflection. It feels like a dynamic language but has the speed and \
safety of a static language."
LICENSE = "BSD-3-Clause"

PV = "1.13.15"

RPM_NAME = "go1.13-1.13.15-2.16.aarch64.rpm"
RPM_HASH = "e927b160f23d917048490b93904e180a7edc134282d21295e56c118fc8e94c22ed30356ebc7d0fce5af8091091328433744c1078870b0ebb1b5b20f65f34df3e"

RPROVIDES:${PN} += "config-go1.13 \
go \
go-devel \
go-devel-static \
go1.13 \
golang-API \
libstd.so"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
binutils-gold \
gcc \
libc.so.6 \
update-alternatives"

inherit rpm
