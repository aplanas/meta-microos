SUMMARY = "A compiled, garbage-collected, concurrent programming language"
DESCRIPTION = "Go is an expressive, concurrent, garbage collected systems programming language \
that is type safe and memory safe. It has pointers but no pointer arithmetic. \
Go has fast builds, clean syntax, garbage collection, methods for any type, and \
run-time reflection. It feels like a dynamic language but has the speed and \
safety of a static language."
LICENSE = "BSD-3-Clause"

PV = "1.19.13"

RPM_NAME = "go1.19-1.19.13-1.1.aarch64.rpm"
RPM_HASH = "e6e818096ea57269acc95efc5cadbdbdd224ff5c0bff5114fb8135344b1b1d588498e9c47bbd19f029300801bb3e39208c4f65cad72177fe0b83915cff3f9b7d"

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
