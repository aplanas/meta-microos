SUMMARY = "Development files for link-grammar, an English grammar checker"
DESCRIPTION = "The Link Grammar Parser is a syntactic parser of a number of \
languages, based on Link Grammar, an original theory of syntax and \
morphology. \
 \
This package contains the development files for development with \
Link Grammar."
LICENSE = "LGPL-2.1-only"

PV = "5.10.5"

RPM_NAME = "link-grammar-devel-5.10.5-1.5.aarch64.rpm"
RPM_HASH = "6d3e249e4f7c975861b9b04c8d392d8d2e7cffe79724ba54328b62b9741261911751df7a82dc35365acc7d6cf1f204a18363869db89d2243b99c968779ba02a1"

RPROVIDES:${PN} += "link-grammar-devel \
link-grammar-devel(aarch-64) \
pkgconfig(link-grammar)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liblink-grammar5"

inherit rpm
