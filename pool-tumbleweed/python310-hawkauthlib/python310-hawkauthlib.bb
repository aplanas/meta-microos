SUMMARY = "Hawk Access Authentication protocol"
DESCRIPTION = "hawkauthlib is a low-level library for implementing Hawk Access Authentication, a \
simple HTTP request-signing scheme described in:https://npmjs.org/package/hawk"
LICENSE = "MPL-2.0"

PV = "2.0.0"

RPM_NAME = "python310-hawkauthlib-2.0.0-5.8.noarch.rpm"
RPM_HASH = "e5a7560d1f00e9dd9e30a7bc9c0d8ef8d02e7df41cf0579c38ff59f1f7e130cd9247d43d62ea4f8b2b062991007342e53962c833b8d1177b0a5c3fb6e45de70e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-hawkauthlib \
python3.10dist-hawkauthlib \
python310-hawkauthlib \
python3dist-hawkauthlib"

RDEPENDS:${PN} += "python-abi \
python310-WebOb"

inherit rpm
