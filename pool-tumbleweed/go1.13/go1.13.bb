SUMMARY = "A compiled, garbage-collected, concurrent programming language"
DESCRIPTION = "Go is an expressive, concurrent, garbage collected systems programming language \
that is type safe and memory safe. It has pointers but no pointer arithmetic. \
Go has fast builds, clean syntax, garbage collection, methods for any type, and \
run-time reflection. It feels like a dynamic language but has the speed and \
safety of a static language."
LICENSE = "BSD-3-Clause"

PV = "1.13.15"

RPM_NAME = "go1.13-1.13.15-2.15.aarch64.rpm"
RPM_HASH = "d93b0760b01759adec8c6d88557848f79b9e7567e5aad9eb4743cad05efdab2e4201de97bd30c9cda48b022d12fe851d06fa1d38fc3630ac7c7ead0894e7b38e"

RPROVIDES:${PN} += "config-go1.13 \
go \
go-devel \
go-devel-static \
go1.13 \
golang-API \
libstd.so"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
binutils-gold \
gcc \
libc.so.6 \
update-alternatives"

inherit rpm
