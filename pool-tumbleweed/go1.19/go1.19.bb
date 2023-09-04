SUMMARY = "A compiled, garbage-collected, concurrent programming language"
DESCRIPTION = "Go is an expressive, concurrent, garbage collected systems programming language \
that is type safe and memory safe. It has pointers but no pointer arithmetic. \
Go has fast builds, clean syntax, garbage collection, methods for any type, and \
run-time reflection. It feels like a dynamic language but has the speed and \
safety of a static language."
LICENSE = "BSD-3-Clause"

PV = "1.19.12"

RPM_NAME = "go1.19-1.19.12-1.1.aarch64.rpm"
RPM_HASH = "4872fe0aa1874b27ac061be2a8eeef8f1f2104694132e593888a836995e35635d99116f14d9b34ca559615096f09433ab0b2c493bf72bcfcfd4dfb05c2294f2a"

RPROVIDES:${PN} += "config-go1.19 \
go \
go-devel \
go-devel-static \
go1.19 \
golang-API"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/env \
/usr/bin/sh \
gcc \
libc.so.6 \
update-alternatives"

inherit rpm
