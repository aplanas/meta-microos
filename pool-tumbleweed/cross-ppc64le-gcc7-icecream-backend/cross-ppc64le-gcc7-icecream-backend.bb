SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "cross-ppc64le-gcc7-icecream-backend-7.5.0+r278197-14.2.aarch64.rpm"
RPM_HASH = "48efaf94d0c9d3818d97dde51120e6db3b373c24e033832a5ae6e4a1679e8eb207c920eb94e44d399a1004af91a49b2f83a9b26cbe1a350c9421f8865ebaba4a"

RPROVIDES:${PN} += "cross-ppc64le-gcc7-icecream-backend"

RDEPENDS:${PN} += ""

inherit rpm
