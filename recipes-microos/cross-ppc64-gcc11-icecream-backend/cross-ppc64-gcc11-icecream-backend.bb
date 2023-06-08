SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "11.3.1+git2076"

RPM_NAME = "cross-ppc64-gcc11-icecream-backend-11.3.1+git2076-2.3.aarch64.rpm"
RPM_HASH = "f5d90816fb69e7fe6cde3f858c311040c3034b5054564929d81e358e5efc6d27d76c680c23e5184409721dd6e4e7d3bb5cea57c7ba89e4226e0b0e2d37208aa7"

RPROVIDES:${PN} += "cross-ppc64-gcc11-icecream-backend cross-ppc64-gcc11-icecream-backend(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
