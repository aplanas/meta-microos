SUMMARY = "Development platform for in-memory data - development files"
DESCRIPTION = "Apache Arrow is a cross-language development platform for in-memory \
data. It specifies a standardized language-independent columnar memory \
format for flat and hierarchical data, organized for efficient \
analytic operations on modern hardware. It also provides computational \
libraries and zero-copy streaming messaging and interprocess \
communication. \
 \
This package provides the static plasma library"
LICENSE = "Apache-2.0 & BSD-3-Clause & BSD-2-Clause & MIT"

PV = "11.0.0"

RPM_NAME = "apache-plasma-devel-static-11.0.0-2.1.aarch64.rpm"
RPM_HASH = "4156b24fb392cffb33b1710f04108c419b56bb37a4bb4147037f20d1fdcb485b596868fe8a8ac96eb06f9911d56e32498be7941262260d95e2914f6e2d1226ce"

RPROVIDES:${PN} += "apache-plasma-devel-static apache-plasma-devel-static(aarch-64)"
RDEPENDS:${PN} += "apache-plasma-devel"

inherit rpm
