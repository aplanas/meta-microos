SUMMARY = "C library intended for use on embedded systems"
DESCRIPTION = "Newlib is a C library intended for use on embedded systems. It is a \
conglomeration of several library parts, all under free software licenses \
that make them easily usable on embedded products."
LICENSE = "BSD-3-Clause & MIT & LGPL-2.0-or-later & ISC"

PV = "4.3.0.20230120"

RPM_NAME = "cross-epiphany-newlib-devel-4.3.0.20230120-2.1.aarch64.rpm"
RPM_HASH = "b7f97f35d36e504a627bc31a14c850c2f311853ec445efba707164301c2d10d05b4bd6c256af5b17e46545e59ef4ae16d2a455fc662ac15be036a0b98a039a76"

RPROVIDES:${PN} += "cross-epiphany-newlib-devel"

RDEPENDS:${PN} += ""

inherit rpm
