SUMMARY = "Fake implementation of redis API for testing purposes"
DESCRIPTION = "Fake implementation of redis API for testing purposes."
LICENSE = "BSD-3-Clause & MIT"

PV = "2.13.0"

RPM_NAME = "python39-fakeredis-2.13.0-1.1.noarch.rpm"
RPM_HASH = "1f63638c99d93c483a34ea4e0b496a6faa3d81b13c3363c747653506370269a12ffe29c33c1596963fe96ae801eefe310b80fc02ff5ce74ea5b327f800588920"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(fakeredis) \
python39-fakeredis \
python3dist(fakeredis)"
RDEPENDS:${PN} += "python(abi) \
python39-redis \
python39-sortedcontainers"

inherit rpm
