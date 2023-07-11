SUMMARY = "A compiled, garbage-collected, concurrent programming language"
DESCRIPTION = "Go is an expressive, concurrent, garbage collected systems programming language \
that is type safe and memory safe. It has pointers but no pointer arithmetic. \
Go has fast builds, clean syntax, garbage collection, methods for any type, and \
run-time reflection. It feels like a dynamic language but has the speed and \
safety of a static language."
LICENSE = "BSD-3-Clause"

PV = "1.20.5"

RPM_NAME = "go1.20-1.20.5-1.1.aarch64.rpm"
RPM_HASH = "c0fa5bce04323ad65aa72742db241a543d82b80681c9efb4896a6137febfbd0a052e1358d28ea6036c5e36b2d96eb007f508948f97fb54b83b30bb4eb5edf25d"

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
