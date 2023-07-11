SUMMARY = "Test update which should not be installable"
DESCRIPTION = "Package for testing the update stack during product development. \
 \
An update for this package should fail."
LICENSE = "GPL-2.0+"

PV = "5.1"

RPM_NAME = "update-test-broken-5.1-1.18.aarch64.rpm"
RPM_HASH = "fb8cd7bbbaf91d65865964cdd0167a1c4443111a68d5918b91e58577a915093efd3d1a6f97a3a583e637b6cf3ec3d60aca6dbdc413137a4d9d3553c712b9a7a3"

RPROVIDES:${PN} += "update-test-broken"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
