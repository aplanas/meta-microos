SUMMARY = "Documentation for the ICU library"
DESCRIPTION = "ICU is a set of C and C++ libraries that provide extensive Unicode \
and locale support. \
This package contains the HTML documentation."
LICENSE = "ICU"

PV = "73.2"

RPM_NAME = "libicu-doc-73.2-2.1.aarch64.rpm"
RPM_HASH = "f7bbe0c1d209da3b5a77d713b4996b58f22fd1f7dc850eaa1b3b2898d1bc6dc45a4ae469e663d76da1e8a1dbe6de89df0f7fc1eb0af49b4d3ca4b1f2cb53fe4f"

RPROVIDES:${PN} += "libicu-doc"

RDEPENDS:${PN} += ""

inherit rpm
