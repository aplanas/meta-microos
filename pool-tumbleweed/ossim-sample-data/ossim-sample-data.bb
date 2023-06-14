SUMMARY = "OSSIM data samples files"
DESCRIPTION = "The OSSIM data samples files for tests."
LICENSE = "LGPL-3.0-only"

PV = "2.11.1"

RPM_NAME = "ossim-sample-data-2.11.1-1.20.aarch64.rpm"
RPM_HASH = "6cb0c3634f77150ee936e200132eea1a2d93b5f2d8e123af88ab114f61c49f7ad2511f1149c388852c6c11eafc727dccd7d3af3be1629af3b591fa3f96197632"

RPROVIDES:${PN} += "ossim-sample-data"

RDEPENDS:${PN} += ""

inherit rpm
