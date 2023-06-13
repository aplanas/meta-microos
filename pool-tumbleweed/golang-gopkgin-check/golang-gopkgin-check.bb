SUMMARY = "Rich testing framework for the Go language"
DESCRIPTION = "The Go language provides an internal testing library, named 'testing', which is \
relatively slim due to the fact that the standard library correctness by itself \
is verified using it. The gocheck package, on the other hand, expects the \
standard library from Go to be working correctly, and builds on it to offer a \
richer testing framework for libraries and applications to use."
LICENSE = "BSD-3-Clause"

PV = "0.0.0+git20161122.aa8c435"

RPM_NAME = "golang-gopkgin-check-0.0.0+git20161122.aa8c435-1.17.aarch64.rpm"
RPM_HASH = "ab753e4f575eec854ed6a06a2885c88cef289dd28247246cefec78ef6ceed3a4b6ab9a1ac14c1de51f711a9f2263851d4e08226e410a251a39e59e786cb284c5"

RPROVIDES:${PN} += "golang-gopkgin-check \
golang-gopkgin-check(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
