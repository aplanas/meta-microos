SUMMARY = "Redfish C Client Library"
DESCRIPTION = "libRedfish is a C client library that allows for Creation of Entities (POST), Read of Entities (GET), Update of Entities (PATCH), Deletion of Entities (DELETE), running Actions (POST), receiving events, and providing some basic query abilities."
LICENSE = "BSD-3-Clause"

PV = "1.3.7.1+git.74758f1"

RPM_NAME = "libredfish-1.3.7.1+git.74758f1-1.1.aarch64.rpm"
RPM_HASH = "7a61b12e9727e1d542810002400ec20ac8f50f824cbbdcee0d6cc1c28f2bf3cf8f2c199baecb5ee383817173a19f3bbce97c6b955726606f1c1fdbcf74ef6042"

RPROVIDES:${PN} += "libredfish"

RDEPENDS:${PN} += "libc.so.6 \
libredfish.so.1 \
readline"

inherit rpm
