SUMMARY = "A compiled, garbage-collected, concurrent programming language"
DESCRIPTION = "Go is an expressive, concurrent, garbage collected systems programming language \
that is type safe and memory safe. It has pointers but no pointer arithmetic. \
Go has fast builds, clean syntax, garbage collection, methods for any type, and \
run-time reflection. It feels like a dynamic language but has the speed and \
safety of a static language."
LICENSE = "BSD-3-Clause"

PV = "1.18.10"

RPM_NAME = "go1.18-1.18.10-4.2.aarch64.rpm"
RPM_HASH = "b2161808a0cbb6eafa4f817f4b25785cd947f191dfcec029173b0e435352ce776eab2a43907aa628e94dd66565ee7050e3d9f444ac06db9dff558a92f172e8a4"

RPROVIDES:${PN} += "config-go1.18 \
go \
go-devel \
go-devel-static \
go1.18 \
golang-API"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/env \
/usr/bin/sh \
gcc \
libc.so.6 \
update-alternatives"

inherit rpm
