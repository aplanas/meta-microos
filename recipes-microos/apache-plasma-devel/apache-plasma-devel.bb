SUMMARY = "Development platform for in-memory data - development files"
DESCRIPTION = "Apache Arrow is a cross-language development platform for in-memory \
data. It specifies a standardized language-independent columnar memory \
format for flat and hierarchical data, organized for efficient \
analytic operations on modern hardware. It also provides computational \
libraries and zero-copy streaming messaging and interprocess \
communication. \
 \
This package provides the development libraries and headers for \
the Plasma component."
LICENSE = "Apache-2.0 & BSD-3-Clause & BSD-2-Clause & MIT"

PV = "11.0.0"

RPM_NAME = "apache-plasma-devel-11.0.0-2.1.aarch64.rpm"
RPM_HASH = "f99ff0aae52d329c9d46efa8001db83de218e110f29d6bb2e55cde030acf6009b1a3de2beace1a285c517c4b57fba183d6d0a78193a0d3022ca37fdf7e1fff8a"

RPROVIDES:${PN} += "apache-plasma-devel apache-plasma-devel(aarch-64) cmake(Plasma) pkgconfig(plasma)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libplasma1100 pkgconfig(arrow)"

inherit rpm
