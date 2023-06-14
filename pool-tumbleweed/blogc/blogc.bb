SUMMARY = "Blog compiler"
DESCRIPTION = "blogc is a blog compiler. It converts source files and templates into blog/website resources."
LICENSE = "BSD-3-Clause"

PV = "0.20.1"

RPM_NAME = "blogc-0.20.1-1.10.aarch64.rpm"
RPM_HASH = "9762207fa6c1995d2a641b12d61d59563bfe2824f670067b6eb4dd0e27ee9a61022e8d6ef177cf799d180a8e2660d22b58b20e8a28b5a895b6a2ccb433e72467"

RPROVIDES:${PN} += "blogc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
