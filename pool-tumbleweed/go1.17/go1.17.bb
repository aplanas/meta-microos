SUMMARY = "A compiled, garbage-collected, concurrent programming language"
DESCRIPTION = "Go is an expressive, concurrent, garbage collected systems programming language \
that is type safe and memory safe. It has pointers but no pointer arithmetic. \
Go has fast builds, clean syntax, garbage collection, methods for any type, and \
run-time reflection. It feels like a dynamic language but has the speed and \
safety of a static language."
LICENSE = "BSD-3-Clause"

PV = "1.17.13"

RPM_NAME = "go1.17-1.17.13-5.1.aarch64.rpm"
RPM_HASH = "7e1df48d76d95e40e381ce2b2fe1ac7ca2ae5d6673863141070809ec4535f6427aa77eaea80719d843b0b137bb1b5ce3c19182f375835b97bf33b9486a527860"

RPROVIDES:${PN} += "config-go1.17 \
go \
go-devel \
go-devel-static \
go1.17 \
golang-API"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/env \
/usr/bin/sh \
gcc \
libc.so.6 \
update-alternatives"

inherit rpm
