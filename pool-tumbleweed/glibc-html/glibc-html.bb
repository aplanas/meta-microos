SUMMARY = "HTML Documentation for the GNU C Library"
DESCRIPTION = "This package contains the HTML documentation for the GNU C library. Due \
to a lack of resources, this documentation is not complete and is \
partially out of date."
LICENSE = "GFDL-1.1-only"

PV = "2.37"

RPM_NAME = "glibc-html-2.37-5.1.noarch.rpm"
RPM_HASH = "f2e30132c7afa32940efb55366c16418609ca2d337899127bffdda07560eeff1be4f0295040c48bbdce2723f5cd88387dc8883b4bf0387e8ecb7452c4826eefd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glibc-html"

RDEPENDS:${PN} += ""

inherit rpm
