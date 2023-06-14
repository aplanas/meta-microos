SUMMARY = "Simple library to encode/decode DNS wire-format packets"
DESCRIPTION = "Simple library to encode/decode DNS wire-format packets."
LICENSE = "BSD-2-Clause"

PV = "0.9.23"

RPM_NAME = "python310-dnslib-0.9.23-1.3.noarch.rpm"
RPM_HASH = "a8e392430e28b81673fd365a39d1dc61042d7cc0ed71c9e1a412e26aab2aa1532f47aeccc9f79538f89d2f43b88f4cddfd4e43fb5b063230ec6f025be43a7f76"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dnslib \
python3.10dist-dnslib \
python310-dnslib \
python3dist-dnslib"

RDEPENDS:${PN} += "python-abi"

inherit rpm
