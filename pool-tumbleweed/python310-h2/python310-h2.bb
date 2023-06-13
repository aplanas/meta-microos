SUMMARY = "HTTP/2 State-Machine based protocol implementation"
DESCRIPTION = "Pure-Python implementation of a HTTP/2 protocol stack. \
It's written from the ground up to be embeddable in whatever program \
you choose to use, ensuring that you can speak HTTP/2 regardless of \
your programming paradigm."
LICENSE = "MIT"

PV = "4.1.0"

RPM_NAME = "python310-h2-4.1.0-3.1.noarch.rpm"
RPM_HASH = "c4169f77856a7a04bd710bd258817f146a7d168111d7a5d3a5e1192f6036588fee1be244b986dd772544af85713f9bcb8d413e343699887d1214b02c3f3fba8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-h2 \
python3.10dist(h2) \
python310-h2 \
python3dist(h2)"

RDEPENDS:${PN} += "python(abi) \
python310-hpack \
python310-hyperframe"

inherit rpm
