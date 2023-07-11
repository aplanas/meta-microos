SUMMARY = "A compiled, garbage-collected, concurrent programming language"
DESCRIPTION = "Go is an expressive, concurrent, garbage collected systems programming language \
that is type safe and memory safe. It has pointers but no pointer arithmetic. \
Go has fast builds, clean syntax, garbage collection, methods for any type, and \
run-time reflection. It feels like a dynamic language but has the speed and \
safety of a static language."
LICENSE = "BSD-3-Clause"

PV = "1.19.10"

RPM_NAME = "go1.19-1.19.10-1.1.aarch64.rpm"
RPM_HASH = "1daf3d347de8ef0e8362b933ead8cdc283afc0303cb908b23916957b26d2875e6fdced89732431b36f1c44e5f8467dded22add16eaa2e7b596994f03f5e89e80"

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
