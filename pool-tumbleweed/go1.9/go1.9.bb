SUMMARY = "A compiled, garbage-collected, concurrent programming language"
DESCRIPTION = "Go is an expressive, concurrent, garbage collected systems programming language \
that is type safe and memory safe. It has pointers but no pointer arithmetic. \
Go has fast builds, clean syntax, garbage collection, methods for any type, and \
run-time reflection. It feels like a dynamic language but has the speed and \
safety of a static language."
LICENSE = "BSD-3-Clause"

PV = "1.9.7"

RPM_NAME = "go1.9-1.9.7-12.10.aarch64.rpm"
RPM_HASH = "83e805918907bc04c9bb8c792f8f65b7d5e205c0cf873b32ce29b2e3256c58f32198af42a8cc7e7be82724a34289082b7581114f785f700b1238f9e45da80f6b"

RPROVIDES:${PN} += "config-go1.9 \
go \
go-devel \
go-devel-static \
go1.9 \
golang-API \
libstd.so"

RDEPENDS:${PN} += "/bin/sh \
gcc \
libc.so.6 \
update-alternatives"

inherit rpm
