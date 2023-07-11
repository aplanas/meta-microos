SUMMARY = "A compiled, garbage-collected, concurrent programming language"
DESCRIPTION = "Go is an expressive, concurrent, garbage collected systems programming language \
that is type safe and memory safe. It has pointers but no pointer arithmetic. \
Go has fast builds, clean syntax, garbage collection, methods for any type, and \
run-time reflection. It feels like a dynamic language but has the speed and \
safety of a static language."
LICENSE = "BSD-3-Clause"

PV = "1.16.15"

RPM_NAME = "go1.16-1.16.15-6.2.aarch64.rpm"
RPM_HASH = "5437ce5852fe268bc9145d959cbc15ffb3a254152a2528f9fb5426455ddc58d39e31815feac9543a9bcde1ec7c0e073c342a9dcb35cd16d30a9c3cb31fc7ffaf"

RPROVIDES:${PN} += "config-go1.16 \
go \
go-devel \
go-devel-static \
go1.16 \
golang-API \
libstd.so"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/env \
/usr/bin/sh \
gcc \
libc.so.6 \
update-alternatives"

inherit rpm
