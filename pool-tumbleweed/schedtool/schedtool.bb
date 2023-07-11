SUMMARY = "Query and set CPU scheduling parameters"
DESCRIPTION = "schedtool can set all CPU scheduling parameters Linux is capable \
of or display information for given processes."
LICENSE = "GPL-2.0"

PV = "1.3.0"

RPM_NAME = "schedtool-1.3.0-14.31.aarch64.rpm"
RPM_HASH = "94c68e2958d4a8988928e6e95d26f24667b6a1acc226fd425a4ecc2f84500bf68a2cbed3d1694580ce600b7673d531dea67b0411182509da767364a75e2b717e"

RPROVIDES:${PN} += "schedtool"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
