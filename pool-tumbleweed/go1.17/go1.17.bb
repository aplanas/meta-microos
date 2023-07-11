SUMMARY = "A compiled, garbage-collected, concurrent programming language"
DESCRIPTION = "Go is an expressive, concurrent, garbage collected systems programming language \
that is type safe and memory safe. It has pointers but no pointer arithmetic. \
Go has fast builds, clean syntax, garbage collection, methods for any type, and \
run-time reflection. It feels like a dynamic language but has the speed and \
safety of a static language."
LICENSE = "BSD-3-Clause"

PV = "1.17.13"

RPM_NAME = "go1.17-1.17.13-5.2.aarch64.rpm"
RPM_HASH = "d4c820f896a47688326043f1cfa42a9d0dcd771bf065edd35ef0eef39cf67f35b0e74258bef8b770f1b467552229acd08e34ec8a7cd6b68a1649d41e44bcb787"

RPROVIDES:${PN} += "config-go1.17 \
go \
go-devel \
go-devel-static \
go1.17 \
golang-API"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/env \
/usr/bin/sh \
gcc \
libc.so.6 \
update-alternatives"

inherit rpm
