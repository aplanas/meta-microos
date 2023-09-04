SUMMARY = "A compiled, garbage-collected, concurrent programming language"
DESCRIPTION = "Go is an expressive, concurrent, garbage collected systems programming language \
that is type safe and memory safe. It has pointers but no pointer arithmetic. \
Go has fast builds, clean syntax, garbage collection, methods for any type, and \
run-time reflection. It feels like a dynamic language but has the speed and \
safety of a static language."
LICENSE = "BSD-3-Clause"

PV = "1.21.0"

RPM_NAME = "go1.21-1.21.0-1.1.aarch64.rpm"
RPM_HASH = "e36669d0183652393e688795dc105e3c0237e9ac756c33dd1b671a89e6d41b035c4700e970d52edfda8f580428025c70177964cdacb29ab1de02a4d0f0a9946e"

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
