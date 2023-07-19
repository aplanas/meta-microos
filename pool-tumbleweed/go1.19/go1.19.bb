SUMMARY = "A compiled, garbage-collected, concurrent programming language"
DESCRIPTION = "Go is an expressive, concurrent, garbage collected systems programming language \
that is type safe and memory safe. It has pointers but no pointer arithmetic. \
Go has fast builds, clean syntax, garbage collection, methods for any type, and \
run-time reflection. It feels like a dynamic language but has the speed and \
safety of a static language."
LICENSE = "BSD-3-Clause"

PV = "1.19.11"

RPM_NAME = "go1.19-1.19.11-1.1.aarch64.rpm"
RPM_HASH = "f61f1c4d36e1b3048785627992fcaa4ea4ec61bc7d8243ca42a3567289a12e2c7e92045fc90b625a683e823ab1d9aa1d5d6046da0b89ea1c0a3786a8b970ba1e"

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
