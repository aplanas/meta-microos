SUMMARY = "A compiled, garbage-collected, concurrent programming language"
DESCRIPTION = "Go is an expressive, concurrent, garbage collected systems programming language \
that is type safe and memory safe. It has pointers but no pointer arithmetic. \
Go has fast builds, clean syntax, garbage collection, methods for any type, and \
run-time reflection. It feels like a dynamic language but has the speed and \
safety of a static language."
LICENSE = "BSD-3-Clause"

PV = "1.21rc2"

RPM_NAME = "go1.21-1.21rc2-1.1.aarch64.rpm"
RPM_HASH = "37f8b1dba4d66619c35e125664928c626a3d4aa272d666e3342df4b3c89bc0eb68a3673e317fb3207405e7808f75f4be5d0080c65d0fb137568e463070a0409a"

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
