SUMMARY = "Fake implementation of redis API for testing purposes"
DESCRIPTION = "Fake implementation of redis API for testing purposes."
LICENSE = "BSD-3-Clause & MIT"

PV = "2.15.0"

RPM_NAME = "python310-fakeredis-2.15.0-1.1.noarch.rpm"
RPM_HASH = "561a952d2439f9350367e17c10408fa43bce30723a14c3fa750be514f6e7be7f8d84a0d04663c1ca189f4c58fc25bd8cabd074678ccfe18098483e80e5fbea8b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-fakeredis \
python310-fakeredis \
python3dist-fakeredis"

RDEPENDS:${PN} += "python-abi \
python310-packaging \
python310-redis \
python310-sortedcontainers"

inherit rpm
