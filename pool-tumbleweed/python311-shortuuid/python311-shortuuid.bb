SUMMARY = "A generator library for concise, unambiguous and URL-safe UUIDs"
DESCRIPTION = "A library that generates short, pretty, unambiguous unique IDs \
by using an extensive, case-sensitive alphabet and omitting \
similar-looking letters and numbers."
LICENSE = "BSD-3-Clause"

PV = "1.0.11"

RPM_NAME = "python311-shortuuid-1.0.11-1.1.noarch.rpm"
RPM_HASH = "1050c2ee3da84eb7d50ddc32ed43caa94f23d0471df86aaad01ae4c5f30e5642b90eaef8bc2cd328547bb689a5b5f433e5f379e72a22e3a0550146c8f8a654e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(shortuuid) \
python311-shortuuid \
python3dist(shortuuid)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-base \
update-alternatives"

inherit rpm
