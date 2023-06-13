SUMMARY = "A compiled, garbage-collected, concurrent programming language"
DESCRIPTION = "Go is an expressive, concurrent, garbage collected systems programming language \
that is type safe and memory safe. It has pointers but no pointer arithmetic. \
Go has fast builds, clean syntax, garbage collection, methods for any type, and \
run-time reflection. It feels like a dynamic language but has the speed and \
safety of a static language."
LICENSE = "BSD-3-Clause"

PV = "1.15.15"

RPM_NAME = "go1.15-1.15.15-1.12.aarch64.rpm"
RPM_HASH = "52163612ff5692450cff55c806babf6a26c9d9f309101d5485f0fed395e7de2ef476634978dba4e6b1da4d9b58a937fe9dd852a42879f07fba37bb435eae02ef"

RPROVIDES:${PN} += "config(go1.15) \
go \
go-devel \
go-devel-static \
go1.15 \
go1.15(aarch-64) \
golang(API) \
libstd.so()(64bit)"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
binutils-gold \
gcc \
libc.so.6()(64bit) \
update-alternatives"

inherit rpm
