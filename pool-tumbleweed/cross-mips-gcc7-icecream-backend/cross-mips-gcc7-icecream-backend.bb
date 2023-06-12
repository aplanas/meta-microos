SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "cross-mips-gcc7-icecream-backend-7.5.0+r278197-14.1.aarch64.rpm"
RPM_HASH = "97e1d8bb2aef82efac2b514eb45436861c2ddd97bc23b76d054e2a74da03a12efe134ac424d921da6ebca987361a6e391d3072ca04601a891fee9446a7c20ac6"

RPROVIDES:${PN} += "cross-mips-gcc7-icecream-backend \
cross-mips-gcc7-icecream-backend(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
