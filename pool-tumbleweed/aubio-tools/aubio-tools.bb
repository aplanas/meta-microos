SUMMARY = "Example programs for aubio library"
DESCRIPTION = "This package includes the example programs for aubio library."
LICENSE = "GPL-3.0-or-later"

PV = "0.4.9"

RPM_NAME = "aubio-tools-0.4.9-10.1.aarch64.rpm"
RPM_HASH = "618939b25ad32439e72f21137bc9e306fbc77292b14e35d2cfb32afc11bd8738e92b04f75ed91255460fce91f61095c0565bcb50aa3f878f184134b23d4e24e7"

RPROVIDES:${PN} += "aubio-tools"

RDEPENDS:${PN} += "libaubio.so.5 \
libc.so.6 \
libjack.so.0"

inherit rpm
