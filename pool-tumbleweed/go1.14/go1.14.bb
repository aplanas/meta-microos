SUMMARY = "A compiled, garbage-collected, concurrent programming language"
DESCRIPTION = "Go is an expressive, concurrent, garbage collected systems programming language \
that is type safe and memory safe. It has pointers but no pointer arithmetic. \
Go has fast builds, clean syntax, garbage collection, methods for any type, and \
run-time reflection. It feels like a dynamic language but has the speed and \
safety of a static language."
LICENSE = "BSD-3-Clause"

PV = "1.14.15"

RPM_NAME = "go1.14-1.14.15-1.13.aarch64.rpm"
RPM_HASH = "ed82d7b60bfa795c8359c17250001ca8c416f53a5174fca13067cbb6f6fd603b9671f7ec37127d14441f3fea3687a3329deb09ddf4167b91e504b857a1514d31"

RPROVIDES:${PN} += "config(go1.14) \
go \
go-devel \
go-devel-static \
go1.14 \
go1.14(aarch-64) \
golang(API) \
libstd.so()(64bit)"
RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
binutils-gold \
gcc \
libc.so.6(GLIBC_2.34)(64bit) \
update-alternatives"

inherit rpm
