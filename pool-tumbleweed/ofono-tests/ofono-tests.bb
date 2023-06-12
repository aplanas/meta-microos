SUMMARY = "Test Scripts for oFono"
DESCRIPTION = "Scripts for testing oFono and its functionality."
LICENSE = "GPL-2.0-only"

PV = "1.34"

RPM_NAME = "ofono-tests-1.34-1.7.aarch64.rpm"
RPM_HASH = "c8dae89c5f8311af24a79dbd50d87c25e6fdced997236ce8af874b03424da526fa5415c645ba5663ba13721f928511312b81ca0a67e9e50aab6ee90d022fc81f"

RPROVIDES:${PN} += "ofono-test \
ofono-tests \
ofono-tests(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/python3 \
ofono"

inherit rpm
