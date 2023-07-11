SUMMARY = "Example applications for OpenAMP"
DESCRIPTION = "This package contains example binaries for OpenAMP."
LICENSE = "BSD-3-Clause"

PV = "2020.01"

RPM_NAME = "openamp-examples-2020.01-1.13.aarch64.rpm"
RPM_HASH = "47f3dfed278a1b302d6f89ff5574045154e1e23b85cf442c107b63e1cb6ea99a9180fffe6260cdb66126632ac01225fbea0a7b010a848c0afddb06ac1c733798"

RPROVIDES:${PN} += "openamp-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmetal.so.0 \
libopen-amp.so.0 \
libopen-amp0"

inherit rpm
