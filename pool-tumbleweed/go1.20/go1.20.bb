SUMMARY = "A compiled, garbage-collected, concurrent programming language"
DESCRIPTION = "Go is an expressive, concurrent, garbage collected systems programming language \
that is type safe and memory safe. It has pointers but no pointer arithmetic. \
Go has fast builds, clean syntax, garbage collection, methods for any type, and \
run-time reflection. It feels like a dynamic language but has the speed and \
safety of a static language."
LICENSE = "BSD-3-Clause"

PV = "1.20.8"

RPM_NAME = "go1.20-1.20.8-1.1.aarch64.rpm"
RPM_HASH = "f92ba65330fa6337b364c41cfeaa01d479d3b9c1c1e8482080ea2c1e222237e81de143220b6ccb2b8bd9620b84c16dba663e6206db140cd22f58f6fcc8f15e71"

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
