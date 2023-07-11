SUMMARY = "Virtual Machine for Scheme48"
DESCRIPTION = "A devel files for scheme48 and scheme48-prescheme. This includes a header files, \
libprescheme.so and scheme48-config."
LICENSE = "BSD-3-Clause"

PV = "1.9.2"

RPM_NAME = "scheme48-devel-1.9.2-2.20.aarch64.rpm"
RPM_HASH = "6f9c8dd918b72287705aa7a788938ad174e826ff5f82fed19035f366ad74610f4e042472d578e2bc20e5cdc6d392cd6bdda9da556daa317a90896b15e8e1c79b"

RPROVIDES:${PN} += "scheme48-devel"

RDEPENDS:${PN} += "/usr/bin/scheme-srfi-7 \
scheme48"

inherit rpm
