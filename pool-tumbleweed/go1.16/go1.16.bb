SUMMARY = "A compiled, garbage-collected, concurrent programming language"
DESCRIPTION = "Go is an expressive, concurrent, garbage collected systems programming language \
that is type safe and memory safe. It has pointers but no pointer arithmetic. \
Go has fast builds, clean syntax, garbage collection, methods for any type, and \
run-time reflection. It feels like a dynamic language but has the speed and \
safety of a static language."
LICENSE = "BSD-3-Clause"

PV = "1.16.15"

RPM_NAME = "go1.16-1.16.15-6.1.aarch64.rpm"
RPM_HASH = "113933990729c072a2fe65b34eeb35d252053e23db0e1f72edffef10217756066cb34ae8fdca92f335ecb92d33dccf60054be7f9e152898f687c8600397dad8c"

RPROVIDES:${PN} += "config(go1.16) \
go \
go-devel \
go-devel-static \
go1.16 \
go1.16(aarch-64) \
golang(API) \
libstd.so()(64bit)"
RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/env \
gcc \
libc.so.6(GLIBC_2.34)(64bit) \
update-alternatives"

inherit rpm
