SUMMARY = "Lightweight Ruby Embedded Environment"
DESCRIPTION = "mruby is the lightweight implementation of the Ruby language complying to (part \
of) the ISO standard. \
 \
This package contains the headers and static library files in order to embed \
mruby into your application."
LICENSE = "MIT"

PV = "3.1.0"

RPM_NAME = "mruby-devel-3.1.0-1.3.aarch64.rpm"
RPM_HASH = "e30774db5fe234ac68d6ebd4c722635e06e2e532043ac99f69cd8cf8a1682f277a4c6389389f2683f5e8b25a01debf4ed6532463611581e6594982377cb17f52"

RPROVIDES:${PN} += "mruby-devel"

RDEPENDS:${PN} += "libmruby-core3-1-0 \
libmruby3-1-0"

inherit rpm
