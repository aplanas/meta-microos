SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "13.0.1+git7231"

RPM_NAME = "cross-m68k-gcc13-icecream-backend-13.0.1+git7231-1.1.aarch64.rpm"
RPM_HASH = "efe9a3a6f23332ed20539d71b90dc6853a94e9b2a8b96ac2ee31ca76ffdc0fefdcc579103b5a9ea824ad57142e71f8e22105274c94d2218284f19e02418a36ad"

RPROVIDES:${PN} += "cross-m68k-gcc13-icecream-backend cross-m68k-gcc13-icecream-backend(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
