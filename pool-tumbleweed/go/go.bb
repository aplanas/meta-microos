SUMMARY = "A compiled, garbage-collected, concurrent programming language"
DESCRIPTION = "Go is an expressive, concurrent, garbage collected systems programming language \
that is type safe and memory safe. It has pointers but no pointer arithmetic. \
Go has fast builds, clean syntax, garbage collection, methods for any type, and \
run-time reflection. It feels like a dynamic language but has the speed and \
safety of a static language."
LICENSE = "BSD-3-Clause"

PV = "1.21"

RPM_NAME = "go-1.21-1.1.aarch64.rpm"
RPM_HASH = "e19dd518f677078fa62fd656372e3e9e922ecb41b2f08557d7e03c4009b0aaa32a0f815a6ea60babde94836232cd8075534ad7852ef8b6df0de20d6371fe0e85"

RPROVIDES:${PN} += "go \
golang \
golang-API"

RDEPENDS:${PN} += "go1.21"

inherit rpm
