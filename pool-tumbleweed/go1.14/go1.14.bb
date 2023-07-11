SUMMARY = "A compiled, garbage-collected, concurrent programming language"
DESCRIPTION = "Go is an expressive, concurrent, garbage collected systems programming language \
that is type safe and memory safe. It has pointers but no pointer arithmetic. \
Go has fast builds, clean syntax, garbage collection, methods for any type, and \
run-time reflection. It feels like a dynamic language but has the speed and \
safety of a static language."
LICENSE = "BSD-3-Clause"

PV = "1.14.15"

RPM_NAME = "go1.14-1.14.15-1.14.aarch64.rpm"
RPM_HASH = "d38fcb32da84f48ef9789afb35c5013685e8adb2cecf16cb4bef3244e578c0b4451b71340f4e38771f3918cff33230c5495aa6ef92ce9f442e55be77c69c112e"

RPROVIDES:${PN} += "config-go1.14 \
go \
go-devel \
go-devel-static \
go1.14 \
golang-API \
libstd.so"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
binutils-gold \
gcc \
libc.so.6 \
update-alternatives"

inherit rpm
