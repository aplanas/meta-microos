SUMMARY = "Hawk Access Authentication protocol"
DESCRIPTION = "hawkauthlib is a low-level library for implementing Hawk Access Authentication, a \
simple HTTP request-signing scheme described in:https://npmjs.org/package/hawk"
LICENSE = "MPL-2.0"

PV = "2.0.0"

RPM_NAME = "python311-hawkauthlib-2.0.0-5.10.noarch.rpm"
RPM_HASH = "92e0082cfe9e2d7eeac5539ffc2404c1eb5b7491044680d67b1747be6d6184d84881cf5a2eba25e532c54291bdcb16e712485632b688f3322736648e614ae929"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-hawkauthlib \
python3.11dist-hawkauthlib \
python311-hawkauthlib \
python3dist-hawkauthlib"

RDEPENDS:${PN} += "python-abi \
python311-WebOb"

inherit rpm
