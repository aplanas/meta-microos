SUMMARY = "A compiled, garbage-collected, concurrent programming language"
DESCRIPTION = "Go is an expressive, concurrent, garbage collected systems programming language \
that is type safe and memory safe. It has pointers but no pointer arithmetic. \
Go has fast builds, clean syntax, garbage collection, methods for any type, and \
run-time reflection. It feels like a dynamic language but has the speed and \
safety of a static language."
LICENSE = "BSD-3-Clause"

PV = "1.21.1"

RPM_NAME = "go1.21-1.21.1-1.1.aarch64.rpm"
RPM_HASH = "27e1cd65278137c523789fc3121ad7f7bb38a6ed5db03ad9977dc4e1808691454d1c876a79b174e0af4a5632747415c0aa38db815f7ec96f01abacc2214a90a5"

RPROVIDES:${PN} += "config-go1.21 \
go \
go-devel \
go-devel-static \
go1.21 \
golang-API"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/env \
/usr/bin/sh \
gcc \
update-alternatives"

inherit rpm
