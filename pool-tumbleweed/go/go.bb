SUMMARY = "A compiled, garbage-collected, concurrent programming language"
DESCRIPTION = "Go is an expressive, concurrent, garbage collected systems programming language \
that is type safe and memory safe. It has pointers but no pointer arithmetic. \
Go has fast builds, clean syntax, garbage collection, methods for any type, and \
run-time reflection. It feels like a dynamic language but has the speed and \
safety of a static language."
LICENSE = "BSD-3-Clause"

PV = "1.20"

RPM_NAME = "go-1.20-1.1.aarch64.rpm"
RPM_HASH = "443b5e9c9fb99e7f163f58f17819a879445db0e06d626137a11f4dd963a540b3d731da2d7619361747db79cfe0ab7a879cdafa76ecfd30c49830b630c94362a1"

RPROVIDES:${PN} += "go \
go(aarch-64) \
golang \
golang(API)"
RDEPENDS:${PN} += "go1.20"

inherit rpm
