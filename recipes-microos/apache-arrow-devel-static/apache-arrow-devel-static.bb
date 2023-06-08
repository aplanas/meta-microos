SUMMARY = "Development platform for in-memory data - development files"
DESCRIPTION = "Apache Arrow is a cross-language development platform for in-memory \
data. It specifies a standardized language-independent columnar memory \
format for flat and hierarchical data, organized for efficient \
analytic operations on modern hardware. It also provides computational \
libraries and zero-copy streaming messaging and interprocess \
communication. \
 \
This package provides the static library"
LICENSE = "Apache-2.0 & BSD-3-Clause & BSD-2-Clause & MIT"

PV = "11.0.0"

RPM_NAME = "apache-arrow-devel-static-11.0.0-2.1.aarch64.rpm"
RPM_HASH = "30f5578e6ed9db16bf3389949d27fbe1f3c9eb0823085de8544565eff4335cd0188548f0d945716908783f001482c043b1cbe62560667777af0341b9e78bba64"

RPROVIDES:${PN} += "apache-arrow-devel-static apache-arrow-devel-static(aarch-64)"
RDEPENDS:${PN} += "apache-arrow-devel"

inherit rpm
