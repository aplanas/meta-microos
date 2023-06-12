SUMMARY = "A compiled, garbage-collected, concurrent programming language"
DESCRIPTION = "Go is an expressive, concurrent, garbage collected systems programming language \
that is type safe and memory safe. It has pointers but no pointer arithmetic. \
Go has fast builds, clean syntax, garbage collection, methods for any type, and \
run-time reflection. It feels like a dynamic language but has the speed and \
safety of a static language."
LICENSE = "BSD-3-Clause"

PV = "1.20.4"

RPM_NAME = "go1.20-1.20.4-1.1.aarch64.rpm"
RPM_HASH = "c719ef6ed9c47cfc8ad96a02750b70de7094f2a2244d0373d95c290b44c014568a5ba6cdc2f9f5b021899fefc721b0c342ddbdb94b99799b9155750917c64932"

RPROVIDES:${PN} += "config(go1.20) \
go \
go-devel \
go-devel-static \
go1.20 \
go1.20(aarch-64) \
golang(API)"
RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/env \
gcc \
libc.so.6(GLIBC_2.34)(64bit) \
update-alternatives"

inherit rpm