SUMMARY = "A compiled, garbage-collected, concurrent programming language"
DESCRIPTION = "Go is an expressive, concurrent, garbage collected systems programming language \
that is type safe and memory safe. It has pointers but no pointer arithmetic. \
Go has fast builds, clean syntax, garbage collection, methods for any type, and \
run-time reflection. It feels like a dynamic language but has the speed and \
safety of a static language."
LICENSE = "BSD-3-Clause"

PV = "1.20.6"

RPM_NAME = "go1.20-1.20.6-1.1.aarch64.rpm"
RPM_HASH = "a2fffefe07bd5bd18e3db43d9ef1e4813a2a38ed5cb5e7d45df468ccc9add82286b70c06ac4e474376a98a2ce51c51880f1f7f84ce763401125669840fdcd551"

RPROVIDES:${PN} += "config-go1.20 \
go \
go-devel \
go-devel-static \
go1.20 \
golang-API"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/env \
/usr/bin/sh \
gcc \
libc.so.6 \
update-alternatives"

inherit rpm
