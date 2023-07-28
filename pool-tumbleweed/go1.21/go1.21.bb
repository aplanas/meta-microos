SUMMARY = "A compiled, garbage-collected, concurrent programming language"
DESCRIPTION = "Go is an expressive, concurrent, garbage collected systems programming language \
that is type safe and memory safe. It has pointers but no pointer arithmetic. \
Go has fast builds, clean syntax, garbage collection, methods for any type, and \
run-time reflection. It feels like a dynamic language but has the speed and \
safety of a static language."
LICENSE = "BSD-3-Clause"

PV = "1.21rc3"

RPM_NAME = "go1.21-1.21rc3-1.1.aarch64.rpm"
RPM_HASH = "36421ae7d318aee6f3549a92eca836a3070e47be2d814e51af4b014b863f73bb39b1c9a5ce3033795cdc027b6498f6e9b23d4948a94d53970bb9906c7c4da61b"

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
